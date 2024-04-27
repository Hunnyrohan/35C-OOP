package week2;
public class SumProductDivision {
    public static void main(String[] args) {
        // Predefined integer values
        int firstNumber = 10; // Replace with the first integer value
        int secondNumber = 5; // Replace with the second integer value

        // Calculate the sum and product
        int sum = firstNumber + secondNumber;
        int product = firstNumber * secondNumber;

        // Calculate the division of the sum by the product
        // Check if the product is not zero to avoid division by zero error
        double divisionResult = product != 0 ? (double) sum / product : 0;

        // Print the results
        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The product of the two numbers is: " + product);
        System.out.println("The division of the sum by the product is: " + divisionResult);
    }
}
