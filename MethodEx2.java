package method;

public class MethodEx2 {

    public static void main(String[] args) {
        String message = "Hello, world";

        printMessage(message, 3);
        printMessage(message, 5);
        printMessage(message, 7);
    }

    private static void printMessage(String message, int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(message);
        }
    }
}
