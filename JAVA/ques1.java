// class MyThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Hello from Thread");
//             try {
//                 Thread.sleep(1000); 
//             } catch (InterruptedException e) {
//                 System.out.println("Thread interrupted: " + e);
//             }
//         }
//     }
// }
// public class ques1 {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         t1.start();
//     }
// }


// class MyRunnable implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i);
//         }
//     }
// }

// public class ques1 {
//     public static void main(String[] args) {
//         MyRunnable m = new MyRunnable();  
//         Thread t = new Thread(m);         
//         t.start();                        
//     }
// }


class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                } else {
                    System.out.println(i + 1);
                }
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }
    }
}

public class ques1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
