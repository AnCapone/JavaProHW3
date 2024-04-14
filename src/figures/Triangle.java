package figures;

public class Triangle implements GeomFigure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double square() {
        double square = 0.5 * base * height;
        System.out.println("Triangle square: " + square);
        return square;
    }
}
