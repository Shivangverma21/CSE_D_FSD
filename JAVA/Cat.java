abstract class Animal{
    abstract public void sound();
}
class Dog extends Animal{
    public void sound(){
        System.out.println("bark");
    }
};
class Cat extends Animal{
    public void sound(){
        System.out.println("meow");
    };
    public static void main(String args[]){
        Dog d=new Dog();
        Cat c=new Cat();
        d.sound();
        c.sound();
    }
}


