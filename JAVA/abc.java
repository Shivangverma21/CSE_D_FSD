// class example{
//     final void demo(){
//         System.out.println("this is my class");
//     }
// }
// class abc extends example{
//     public static void main(String args[]){
//         abc e=new abc();
//         e.demo();
//     }
// }

final class example{
}
class abc extends example{
    void demo(){
        System.out.println("this is my class");
    }
    public static void main(String args[]){
        abc e=new abc();
        e.demo();
    }
}