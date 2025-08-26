public class Student {
    String name;
    int rollNo;
    float marks;
    public Student(String name, int rollNo, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, 88.5f);
        student1.displayDetails();
    }
}

