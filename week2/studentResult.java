package week2;
public class studentResult {
    public static void main(String[] args) {
        // Predefined values for marks of four subjects
        double marks1 = 85; // Replace with actual marks for subject 1
        double marks2 = 74; // Replace with actual marks for subject 2
        double marks3 = 63; // Replace with actual marks for subject 3
        double marks4 = 56; // Replace with actual marks for subject 4

        // Calculate total marks and percentage
        double totalMarks = marks1 + marks2 + marks3 + marks4;
        double percentage = (totalMarks / 400) * 100;

        // Determine the final result using ternary operator
        String result = (percentage >= 70) ? "First Class" :
                        (percentage > 59) ? "Upper Second Class" :
                        (percentage > 49) ? "Second Class" :
                        (percentage > 39) ? "Third Class" : "Fail";

        // Print the total marks, percentage and final result
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Final Result: " + result);
    }
}
