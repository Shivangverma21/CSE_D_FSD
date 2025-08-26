// import java.util.Scanner;
// public class Strings {
//     public static void main(String[] args){
//         //String name=new String("Shivang");
//         //String name="Shivang";
//         //System.out.print("The name is: ");
//         //System.out.println(name);
//         //int a=6;
//         //float b=5.6454f;
//         //System.out.printf("The value of a is %d and value of b is %f", a, b);
//         //System.out.format("The value of a is %d and value of b is %f", a, b);
//         Scanner sc=new Scanner(System.in);
//         String st=sc.nextLine();
//         System.out.println(st);
//     }
// }


public class Strings {
    public static void main(String[] args){
        String name="Shivang";
        //System.out.println(name);
        int value=name.length();
        System.out.println(value);
        //String lstring=name.toLowerCase();
        //System.out.println(lstring);
        //String ustring=name.toUpperCase();
        //System.out.println(ustring);
        //String nonTrimmedString="            Shivang          ";
        //System.out.println(nonTrimmedString);
        //String trimmedString=nonTrimmedString.trim();
        //System.out.println(trimmedString);

        //System.out.println(name.substring(2));
        //System.out.println(name.substring(1,5));
        //System.out.println(name.replace('v','r'));
        //System.out.println(name.startsWith("Shi"));
        //System.out.println(name.endsWith("ng"));
        //System.out.println(name.charAt(3));
        String modifiedName="shihivang";
        //System.out.println(modifiedName.indexOf("hi"));
        //System.out.println(modifiedName.indexOf("hi",5));
        //System.out.println(modifiedName.lastIndexOf("ng"));
        //System.out.println(modifiedName.lastIndexOf("ng",4));
        // System.out.println(modifiedName.equals(modifiedName));
        System.out.println(modifiedName.equalsIgnoreCase(modifiedName));

        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \\ double quote");
        System.out.println("I am escape sequence \n double quote");
        System.out.println("I am escape sequence \t double quote");
    }
}
