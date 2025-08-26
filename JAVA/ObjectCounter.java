//Write a Java program to demonstrate the use of a
// static variable and a static method in a class to count the number of objects created.

public class ObjectCounter {
    private static int objectCount = 0;
    public ObjectCounter() {
        objectCount++;
        System.out.println("Object created. Current count: " + objectCount);
    }
    public static int getObjectCount() {
        return objectCount;
    }
    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        ObjectCounter obj4 = new ObjectCounter();

        int count = ObjectCounter.getObjectCount();
        System.out.println("Total number of objects created: " + count);
    }
}
