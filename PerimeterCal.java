class Perimeter {

    // Perimeter of Circle
    void perimeter(double radius) {
        double result = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + result);
    }

    // Perimeter of Square
    void perimeter(int side) {
        int result = 4 * side;
        System.out.println("Perimeter of Square: " + result);
    }

    // Perimeter of Triangle
    void perimeter(int side1, int side2, int side3) {
        int result = side1 + side2 + side3;
        System.out.println("Perimeter of Triangle: " + result);
    }

    // Perimeter of Trapezium
    void perimeter(double a, double b, double c, double d) {
        double result = a + b + c + d;
        System.out.println("Perimeter of Trapezium: " + result);
    }
     public class PerimeterCal{
    public static void main(String[] args) {
        Perimeter p = new Perimeter();

        p.perimeter(5.0);                // Circle
        p.perimeter(4);                  // Square
        p.perimeter(3, 4, 5);            // Triangle
        p.perimeter(5.0, 6.0, 7.0, 8.0); // Trapezium
    }
}
}