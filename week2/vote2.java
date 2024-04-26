package week2;
public class vote2{
    public static void main(String[] args) {
        // Assuming age is provided as an input to the program
        int age = 20; // Replace 20 with the actual age input

        // Using the ternary operator to check eligibility
        String eligibility = (age >= 18) ? "eligible" : "not eligible";

        // Print the result
        System.out.println("You are " + eligibility + " to vote.");
    }
}
