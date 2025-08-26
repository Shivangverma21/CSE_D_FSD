// Create a base class Animal with method sound() that prints "Animal sound".
// Override it in subclass Dog to print "Bark" and also call the parent class method using super.

class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("bark");
    }
}
public class ani{
    public static void main(String args[]){
        Dog d=new Dog();
        d.sound();
    }
}

