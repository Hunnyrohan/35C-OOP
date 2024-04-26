package week2;
public class GeometryCalculator {
    public static void main(String[] args) {
        // Triangle dimensions
        double base = 5.0; // Base of the triangle
        double height = 8.0; // Height of the triangle

        // Cube dimensions
        double cubeSide = 4.0; // Side length of the cube

        // Cuboid dimensions
        double cuboidLength = 6.0; // Length of the cuboid
        double cuboidWidth = 3.0; // Width of the cuboid
        double cuboidHeight = 5.0; // Height of the cuboid

        // Calculate area of the triangle
        double areaOfTriangle = 0.5 * base * height;

        // Calculate volume of the cube
        double volumeOfCube = Math.pow(cubeSide, 3);

        // Calculate volume of the cuboid
        double volumeOfCuboid = cuboidLength * cuboidWidth * cuboidHeight;

        // Print results
        System.out.println("Area of the triangle: " + areaOfTriangle);
        System.out.println("Volume of the cube: " + volumeOfCube);
        System.out.println("Volume of the cuboid: " + volumeOfCuboid);
    }
}