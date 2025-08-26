//Create a class MyRunnable that implements Runnable. 
//Override run() to print "Thread is running" five times. Create and run this thread using the Thread class constructor.

class MyRunnable implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread is running");
        }
    }
}
public class multi{
    public static void main(String[] args){
        MyRunnable m=new MyRunnable();
        Thread t1=new Thread(m);
        t1.start();
    }
}

//Create two threads, set custom names for each using setName(), and print their names using getName() inside the run() method.

// public class multi extends Thread{
//     public void run(){
//         System.out.println(getName());
//     }
//     public static void main(String args[]){
//         multi t1=new multi();
//         multi t2=new multi();
//         t1.setName("shivang");
//         t2.setName("sonu");
//         t1.start();
//         t2.start();
//     }
// }


