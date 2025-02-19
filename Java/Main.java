import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Read a string (without newline issues)
        scanner.nextLine(); // Consume the newline left by nextInt()

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Print the inputs
        System.out.println("You entered: " + number);
        System.out.println("You entered: " + text);

        scanner.close();
    }
}