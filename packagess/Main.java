
package packagess;
import mathoperations.Addition;  
public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        int result = addition.add(10, 20);
        System.out.println("The sum of 10 and 20 is: " + result);
    }
}