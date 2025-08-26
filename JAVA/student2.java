// Create a class Student with instance variables name and rollNo, and a static variable college. 
// Assign the college name using a static block. Print the student details using a method.

public class student2 {
    public String name;
    public int rollNo;
    static String college;
    public student2(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    static{
        college="ABES";
    }
    
    public void displayDetails() {
        System.out.println("student2 Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("college: " + college);
    }
    public static void main(String[] args) {
        student2 student1 = new student2("Alice", 101);
        student1.displayDetails();
    }
}

