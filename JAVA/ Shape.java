abstract class Shape {
    abstract double calculateArea();
}
class Rectangle extends Shape {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double calculateArea() {
        return width * height;  
    }
}
class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double calculateArea() {
        return 0.5 * base * height;  
    }
}
public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        Shape tri = new Triangle(6, 8);
        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Area of Triangle: " + tri.calculateArea());
    }
}
