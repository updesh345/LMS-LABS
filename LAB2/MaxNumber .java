import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find the maximum using the ternary operator
        int max = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum between " + num1 + " and " + num2 + " is: " + max);

        scanner.close();
    }
}
