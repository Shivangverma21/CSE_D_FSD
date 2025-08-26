// import java.util.*;
// import java.util.stream.*;
// public class streamexample {
//     public static void main(String args[]){
//     List<String>names=Arrays.asList("Shivang","sonu","shailesh");
//     names.stream().filter(name->name.startsWith("S")).forEach(System.out::println);
// }
// }


// import java.util.*;
// import java.util.stream.*;
// public class streamexample {
//     public static void main(String args[]){
//     List<Integer>numbers=Arrays.asList(1,2,3,4,5,6);
//     numbers.stream().filter(n->n%2==0.).map(n->n*n).forEach(System.out::println);
// }
// }


// import java.util.*;
// import java.util.stream.*;
// public class streamexample {
//     public static void main(String args[]){
//     List<Integer>numbers=Arrays.asList(1,3,2,5,4,6);
//     numbers.stream().sorted().forEach(System.out::println);
// }
// }


// import java.util.Scanner;
// public class streamexample {
//     public static void main(String[] args){
//         Scanner sc=null;
//         try{
//             sc=new Scanner(System.in);
//             System.out.println("Enter the number");
//             int num=sc.nextInt();
//             System.out.println("You entered the number:"+num);
//         }
//         catch(Exception e){
//             System.out.println("Invalid input");
//         }
//         finally{
//             if(sc!=null){
//                 sc.close();     //manually close the scanner
//             }
//         }
// }
// }


// import java.util.Scanner;
// public class streamexample {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.println("Enter the number:");
//             int num = sc.nextInt();
//             System.out.println("You entered the number: " + num);
//         } catch (Exception e) {
//             System.out.println("Invalid Input");
//         }
//     }
// }


// import java.util.*;
// public class streamexample{
//     public static void main(String[] args){
//         ArrayList<String>names=new ArrayList<String>();
//         names.add("Shivang");
//         names.add("sonu");
//         names.add("shailesh");
//         for(String name:names){
//             System.out.println(name);
//         }
//     }
// }


// import java.util.*;
// public class streamexample{
//     public static void main(String[] args){
//         ArrayList<String>names=new ArrayList<>();
//         names.add("Shivang");
//         names.add("sonu");
//         names.add("shailesh");
//         for(String name:names){
//             System.out.println(name);
//         }
//     }
// }


public class fieldKey {
    public static void main(String[] args) {
        String day="Monday";
        String res=""; //we manully store the result
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wedday":
            case "Thrusday":
            case "Friday":
                res="weekday";
                break;
            case "Sturday":
            case "Sunday":
                res="weekend";
                break;
            default:
                res="Invalid day";
                break;
            
        }
        System.out.println("It is "+res);
    }
}
