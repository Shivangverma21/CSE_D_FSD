// Create an abstract class Employee with a constructor that prints "Employee created". 
// Extend it in Manager class and display the use of constructor in abstract class.

abstract class employee {
    public employee() {
        System.out.println("Employee created");
    }
    abstract public void money();
}
class manager extends employee {
    public manager() {
        System.out.println("Manager created");
    }
    public void money() {
        System.out.println("Salary");
    }
    public static void main(String args[]) {
        manager m = new manager();  
        m.money();  
    }
}