public class Car {
    static int totalCars = 0;
    String brand;
    int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        totalCars++;
    }

    public static void displayTotalCars() {
        System.out.println("Total cars created: " + totalCars);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 120);
        Car car2 = new Car("Honda", 150);
        Car car3 = new Car("Ford", 130);

        Car.displayTotalCars();
    }
}