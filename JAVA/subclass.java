// class example{
//     int num=100;
// }
// class subclass extends example{
//     int num=110;
//     void print(){
//         System.out.println(num);
//     }
//     public static void main(String args[])
//     {
//         subclass s=new subclass();
//         s.print();
//     }
// }


// class example{
//     int num=100;
// }
// class subclass extends example{
//     int num=110;
//     void print(){
//         System.out.println(num);
//     }
//     void disp(){
//         System.out.println(super.num);
//     }
//     public static void main(String args[])
//     {
//         subclass s=new subclass();
//         s.print();
//         s.disp();
//     }
// }


// class example{
//     int num=100;
// }
// class subclass extends example{
//     int num=110;
//     void print(){
//         System.out.println(num);
//         System.out.println(super.num);
//     }
//     public static void main(String args[])
//     {
//         subclass s=new subclass();
//         s.print();
//     }
// }


// class example{
//     example(){
//         System.out.println("Constructor of the parent class");
//     }
// }
//     class subclass extends example{
//         subclass(){
//              System.out.println("Constructor of the child class");
//         }
//         subclass(int num){
//              System.out.println("arg Constructor of the child class");
//         }
//         void display(){
//              System.out.println("hello");
//         }
//         public static void main(String args[]){
//             subclass s=new subclass();
//             s.display();
//             subclass s2=new subclass(10);
//             s2.display();
//         }
//     }


class example{
    void display(){
         System.out.println("parent class method");
    }
}
class subclass extends example{
    void display(){
         System.out.println("child class method");
    }
    void print(){
        display();
        super.display();
    }
    public static void main(String args[]){
        subclass s=new subclass();
        s.print();
    }
}