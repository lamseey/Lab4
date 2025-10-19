package problem6;

public class Square extends Forme {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getSurface() {
        // get only first two digits after decimal point
        return Math.round(sideLength * sideLength * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Square (side " + sideLength + " cm)";
    }
}
