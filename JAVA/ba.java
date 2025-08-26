// Create a class Bank with a method getInterestRate(). Override this method in subclasses SBI, ICICI, and HDFC to return different rates.
// Create objects and call the method to see runtime polymorphism.

class Bank{
    public double getInterestRate(){
        return 0.0;
    }
}
class SBI extends Bank{
    public double getInterestRate(){
        return 10.0;
    }
}
class ICICI extends Bank{
    public double getInterestRate(){
        return 11.5;
    }
}
class HDFC extends Bank{
    public double getInterestRate(){
        return 9.7;
    }
}
public class ba {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        HDFC h=new HDFC();
        System.out.println("SBI bank intrest rate : "+s.getInterestRate());
        System.out.println("ICICI bank intrest rate : "+i.getInterestRate());
        System.out.println("HDFC bank intrest rate : "+h.getInterestRate());
        
    }
}