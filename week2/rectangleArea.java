package week2;
public class rectangleArea {
    public static void main(String[] args) {
        // Predefined values for length and breadth
        double length = 7.5; // Replace with the actual length input
        double breadth = 4.8; // Replace with the actual breadth input

        // Calculate the area of the rectangle
        double area = length * breadth;

        // Type cast the area to int
        int areaInt = (int) area;

        // Print the area as an integer
        System.out.println("The area of the rectangle is: " + areaInt);
    }
}
