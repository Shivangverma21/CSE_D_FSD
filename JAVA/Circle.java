public class Circle {
    static final double PI = 3.14;
    public static double calculateArea(double radius) {
        return PI * radius * radius;  
    }
    public static void main(String[] args) {
        double radius = 5.0;
        double area = calculateArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}

