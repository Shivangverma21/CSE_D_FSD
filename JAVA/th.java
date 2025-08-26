// class mythread extends Thread{
//     public void run(){
//         System.out.println("Thread Running....");
//     }
//     public static void main(String args[]){
//         mythread t1=new mythread();
//         mythread t2=new mythread();
//         t1.start();
//         System.out.println("t1 thread priority is:"+t1.getPriority());
//         System.out.println("t2 thread priority is:"+t2.getPriority());
//     }
// }


class mythread extends Thread{
    public void run(){
        System.out.println("Thread is Running....");
    }
    public static void main(String args[]){
        mythread m1=new mythread();
        m1.start();
        m1.setPriority(3);
        int p=m1.getPriority();
        System.out.println("thread priority is:"+p);
    }
}


//Create a class MyThread that extends Thread. 
//Override the run() method to print numbers from 1 to 5. Create and start two threads using this class.

// class mythread extends Thread{
//     public void run(){
//         for(int i=1;i<=5;i++){
//             System.out.println(i);
//         }
//     }
// }
// public class th{
//     public static void main(String args[]){
//         mythread t1=new mythread();
//         mythread t2=new mythread();
//         t1.start();
//         t2.start();
//     }
// }





