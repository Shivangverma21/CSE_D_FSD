public class DisplayMessage {
    public void show() {
        System.out.println("This is the default message.");
    }
    public void show(String message) {
        System.out.println(message);
    }
    public void show(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        DisplayMessage display = new DisplayMessage();
        display.show();
        display.show("Hello, World!");
        display.show("Repeat this message", 3);
    }
}
