package week2;
public class SI{
    public static void main(String[] args) {
        // Given values
        double principalAmount = 1000; // in Rs
        double time = 2; // in years
        double rate = 5; // annual interest rate in percentage

        // Calculate Simple Interest
        double simpleInterest = (principalAmount * time * rate) / 100;

        // Print the Simple Interest
        System.out.println("Simple Interest: Rs." + simpleInterest);
    }
}