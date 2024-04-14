package figures;

public class Round implements GeomFigure{
    private double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        double square = Math.PI * Math.pow(radius, 2);
        System.out.println("Round square: " + square);
        return square;
    }
}
