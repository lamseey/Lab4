package problem6;

public class Circle extends Forme {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        // get only first two digits after decimal point
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Circle (radius " + radius + " cm)";
    }
}
