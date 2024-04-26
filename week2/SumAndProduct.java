package week2;
import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        // Calculate the sum and product
        int sum = firstNumber + secondNumber;
        int product = firstNumber * secondNumber;

        // Print the results
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
        System.out.println("The product of " + firstNumber + " and " + secondNumber + " is: " + product);

        // Close the scanner
        scanner.close();
    }
}
