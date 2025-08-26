public class Operators {
    public static void main(String[] args){
        //Arithmetic Operators
        int a=4;
        int b=6%a;     //Modulo Operator
        //4.8%1.1 --> Returns Decimal Remainder
        //Assignment Operators
        //int b=9;
        b*=3;
        System.out.println(b);
        //Comparison Operators
        System.out.println(64<6);
        //Logical Operators
        System.out.println(64>5 || 64>98);
        //Bitwise Operators
        System.out.println(2&3);

        //Increment and Decrement Operators
        int i=56;
        // int b=i++; //first b is assigned i (56) then i is incremented
        int j=67;
        int c=++j;    //first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        char ch='a';
        System.out.println(++ch);
    }
}
