// interface Myinter{
//     void method();
//     void methoda();
// }
// class demo implements Myinter
// {
//     public void method(){
//         System.out.println("Implementation of method");
//     }
//     public void methoda(){
//         System.out.println("Implementation of methoda");
//     }
//     public static void main(String args[]){
//     Myinter b=new demo();
//     b.method();
//     b.methoda();
// }
// }


interface Myinter{
    public static final int a=10;
    static int b=20;
    final int c=30;
    void method();
    void methoda();
}
class demo implements Myinter
{
    public void method(){
        System.out.println("Implementation of method");
    }
    public void methoda(){
        System.out.println("Implementation of methoda");
    }
    public static void main(String args[]){
    Myinter b=new demo();
    System.out.println(a+" "+b+" "+c);
    b.method();
    b.methoda();
}
}