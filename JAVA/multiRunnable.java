// class A implements Runnable{
//     public void run(){
//         System.out.println("Thread A");
//     }
// }
// class B implements Runnable{
//     public void run(){
//         System.out.println("Thread B");
//     }
// }
// public class multiRunnable{
//     public static void main(String[] args) {
//         A a=new A();
//         B b=new B();
//         Thread t1=new Thread(a);
//         Thread t2=new Thread(b);
//         t1.start();
//         t2.start(); 
//     }
// }


class A extends Thread{
    public void run(){
        int i;
        for(i=0;i<10;i++){
        System.out.println(i+1 + " Thread A");
        }
    }
}
class B extends Thread{
    public void run(){
        int i;
        for(i=0;i<10;i++){
        System.out.println(i+1 + " Thread B");
        }
    }
}
public class multiRunnable{
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.start();
        b.start(); 
    }
}


