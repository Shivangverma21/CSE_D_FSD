//Write a program to implement the SRTF CPU scheduling algorithm.

#include <stdio.h>
#include <limits.h>

#define MAX 100

typedef struct {
    int pid;
    int arrival_time;
    int burst_time;
    int remaining_time;
    int waiting_time;
    int turnaround_time;
    int completion_time;
} Process;

void calculateSRTF(Process p[], int n) {
    int complete = 0, t = 0;
    int shortest = -1;
    int finish_time;
    int check = 0;

    for (int i = 0; i < n; i++) {
        p[i].remaining_time = p[i].burst_time;
    }

    while (complete != n) {
        int min_remaining = INT_MAX;
        check = 0;

        for (int j = 0; j < n; j++) {
            if ((p[j].arrival_time <= t) &&
                (p[j].remaining_time < min_remaining) &&
                (p[j].remaining_time > 0)) {
                min_remaining = p[j].remaining_time;
                shortest = j;
                check = 1;
            }
        }

        if (check == 0) {
            t++;
            continue;
        }

        p[shortest].remaining_time--;

        if (p[shortest].remaining_time == 0) {
            complete++;
            finish_time = t + 1;
            p[shortest].completion_time = finish_time;
            p[shortest].waiting_time = finish_time - p[shortest].burst_time - p[shortest].arrival_time;

            if (p[shortest].waiting_time < 0)
                p[shortest].waiting_time = 0;
        }

        t++;
    }

    for (int i = 0; i < n; i++) {
        p[i].turnaround_time = p[i].burst_time + p[i].waiting_time;
    }
}

void printProcesses(Process p[], int n) {
    float total_wt = 0, total_tat = 0;

    printf("\nPID\tArrival\tBurst\tWaiting\tTurnaround\n");
    for (int i = 0; i < n; i++) {
        total_wt += p[i].waiting_time;
        total_tat += p[i].turnaround_time;
        printf("%d\t%d\t%d\t%d\t%d\n",
               p[i].pid, p[i].arrival_time, p[i].burst_time,
               p[i].waiting_time, p[i].turnaround_time);
    }

    printf("\nAverage Waiting Time = %.2f", total_wt / n);
    printf("\nAverage Turnaround Time = %.2f\n", total_tat / n);
}

int main() {
    int n;
    Process p[MAX];

    printf("Enter number of processes: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        p[i].pid = i + 1;
        printf("Enter arrival time and burst time for process %d (format: arrival burst): ", i + 1);
        scanf("%d %d", &p[i].arrival_time, &p[i].burst_time);
    }

    calculateSRTF(p, n);
    printProcesses(p, n);

    return 0;
}
