//Create a Person superclass and an Employee subclass. 
//Include name, age in Person and employee ID, designation in Employee. Use constructors and super() keyword.

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Employee extends Person {
    private int employeeId;
    private String designation;
    public Employee(String name, int age, int employeeId, String designation) {
        super(name, age);
        this.employeeId = employeeId;
        this.designation = designation;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getDesignation() {
        return designation;
    }
    public void displayEmployeeDetails() {
        super.displayPersonDetails(); 
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Designation: " + designation);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 30, 12345, "Software Engineer");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Designation: " + emp.getDesignation());
        System.out.println("\n--- Employee Details ---");
        emp.displayEmployeeDetails();
        Person person = new Person("Jane Smith", 25);
        System.out.println("\n--- Person Details ---");
        person.displayPersonDetails();
    }
}
