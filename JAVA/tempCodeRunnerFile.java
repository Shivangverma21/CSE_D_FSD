public class multi extends Thread{
    public void run(){
        System.out.println(getName());
    }
    public static void main(String args[]){
        multi t1=new multi();
        multi t2=new multi();
        t1.setName("shivang");
        t2.setName("sonu");
        t1.start();
        t2.start();
    }
}
