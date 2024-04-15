package figures;

public class SquareFigure implements GeomFigure{
    private double side;

    public SquareFigure(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        double area = Math.pow(side, 2);
        System.out.println("Square area: " + area);
        return area;
    }

}
