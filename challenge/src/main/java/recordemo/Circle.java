package recordemo;

public record Circle(double radius) {


    // Instance method to calculate area
    public double area() {
        return Math.PI * radius * radius;
    }

    // Instance method to calculate circumference
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

            Circle validCircle = new Circle(10.0);
            System.out.println("Circle with radius " + validCircle.radius() +
                    " has area: " + validCircle.area() +
                    " and circumference: " + validCircle.circumference());

            // Test case for invalid radius
            Circle invalidCircle = new Circle(-5.0);

    }
}