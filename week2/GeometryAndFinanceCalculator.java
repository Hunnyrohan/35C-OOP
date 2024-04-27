package week2;
public class GeometryAndFinanceCalculator {
    public static void main(String[] args) {
        // Predefined values for the square
        double sideLength = 5.0; // Replace with the actual side length of the square

        // Calculate area and perimeter of the square
        double areaOfSquare = sideLength * sideLength;
        double perimeterOfSquare = 4 * sideLength;

        // Predefined values for simple interest calculation
        double principal = 1000.0; // Replace with the actual principal amount
        double rateOfInterest = 5.0; // Replace with the actual annual interest rate
        double timePeriod = 2.0; // Replace with the actual time period in years

        // Calculate simple interest
        double simpleInterest = (principal * rateOfInterest * timePeriod) / 100;

        // Predefined values for the triangle
        double baseOfTriangle = 4.0; // Replace with the actual base of the triangle
        double heightOfTriangle = 3.0; // Replace with the actual height of the triangle

        // Calculate area of the triangle
        double areaOfTriangle = 0.5 * baseOfTriangle * heightOfTriangle;

        // Predefined values for the cube
        double cubeSideLength = 3.0; // Replace with the actual side length of the cube

        // Calculate volume of the cube
        double volumeOfCube = Math.pow(cubeSideLength, 3);

        // Predefined values for the cuboid
        double cuboidLength = 6.0; // Replace with the actual length of the cuboid
        double cuboidWidth = 2.0; // Replace with the actual width of the cuboid
        double cuboidHeight = 4.0; // Replace with the actual height of the cuboid

        // Calculate volume of the cuboid
        double volumeOfCuboid = cuboidLength * cuboidWidth * cuboidHeight;

        // Print results
        System.out.println("Area of the square: " + areaOfSquare);
        System.out.println("Perimeter of the square: " + perimeterOfSquare);
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Area of the triangle: " + areaOfTriangle);
        System.out.println("Volume of the cube: " + volumeOfCube);
        System.out.println("Volume of the cuboid: " + volumeOfCuboid);
    }
}
