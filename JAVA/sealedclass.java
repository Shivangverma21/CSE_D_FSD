// sealed class rohan permits riya, sonu, ram {
//     public void printname() {
//         System.out.println("default");
//     }
// }
// non-sealed class riya extends rohan {
//     @Override
//     public void printname() {
//         System.out.println("riya");
//     }
// }
// sealed class sonu extends rohan permits mySonu {
//     @Override
//     public void printname() {
//         System.out.println("sonu loves java");
//     }
// }
// final class ram extends rohan {
//     @Override
//     public void printname() {
//         System.out.println("ram is coding");
//     }
// }
// final class mySonu extends sonu {
//     @Override
//     public void printname() {
//         System.out.println("mySonu is learning");
//     }
// }
// public class sealedclass {
//     public static void main(String[] args) {
//         ram obj1 = new ram();
//         mySonu obj2 = new mySonu();
//         rohan obj3 = new riya(); 
//         obj1.printname();
//         obj2.printname();
//         obj3.printname();
//     }
// }

