#include <stdio.h>

void calculateNeed(int need[][10], int max[][10], int alloc[][10], int P, int R) {
    for (int i = 0; i < P; i++)
        for (int j = 0; j < R; j++)
            need[i][j] = max[i][j] - alloc[i][j];
}

int isSafe(int processes[], int avail[], int max[][10], int alloc[][10], int P, int R) {
    int need[10][10];
    calculateNeed(need, max, alloc, P, R);

    int finish[10] = {0};
    int safeSeq[10];
    int work[10];

    for (int i = 0; i < R; i++)
        work[i] = avail[i];

    int count = 0;
    while (count < P) {
        int found = 0;
        for (int i = 0; i < P; i++) {
            if (finish[i] == 0) {
                int j;
                for (j = 0; j < R; j++)
                    if (need[i][j] > work[j])
                        break;

                if (j == R) {
                    for (int k = 0; k < R; k++)
                        work[k] += alloc[i][k];

                    safeSeq[count++] = processes[i];
                    finish[i] = 1;
                    found = 1;
                }
            }
        }

        if (!found) {
            printf("System is not in a safe state.\n");
            return 0;
        }
    }

    printf("System is in a safe state.\nSafe Sequence is: ");
    for (int i = 0; i < P; i++)
        printf("%d ", safeSeq[i]);
    printf("\n");

    return 1;
}

int main() {
    int P, R;
    printf("Enter number of processes: ");
    scanf("%d", &P);
    printf("Enter number of resources: ");
    scanf("%d", &R);

    int processes[P], avail[R], max[P][10], alloc[P][10];

    printf("Enter process IDs: ");
    for (int i = 0; i < P; i++)
        scanf("%d", &processes[i]);

    printf("Enter available resources: ");
    for (int i = 0; i < R; i++)
        scanf("%d", &avail[i]);

    printf("Enter max resource matrix:\n");
    for (int i = 0; i < P; i++)
        for (int j = 0; j < R; j++)
            scanf("%d", &max[i][j]);

    printf("Enter allocation matrix:\n");
    for (int i = 0; i < P; i++)
        for (int j = 0; j < R; j++)
            scanf("%d", &alloc[i][j]);

    isSafe(processes, avail, max, alloc, P, R);

    return 0;
}