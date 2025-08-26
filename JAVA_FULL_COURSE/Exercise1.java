//Write a program to calculate percentage of a given student in cbse board exam. 
//His marks from 5 subjects must be taken as input from the keyboard.(Marks are out of 100)

import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter subject 1 marks out of 100");
        int a=sc.nextInt();
        System.out.println("enter subject 2 marks out of 100");
        int b=sc.nextInt();
        System.out.println("enter subject 3 marks out of 100");
        int c=sc.nextInt();
        System.out.println("enter subject 4 marks out of 100");
        int d=sc.nextInt();
        System.out.println("enter subject 5 marks out of 100");
        int e=sc.nextInt();
        int total=a+b+c+d+e;
        double percentage=(total/500.0)*100;
        System.out.println("The percentage is");
        System.out.println(percentage);
    }
}
