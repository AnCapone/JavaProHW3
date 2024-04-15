package figures;

public class Round implements GeomFigure{
    private double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Round area: " + area);
        return area;
    }
}
