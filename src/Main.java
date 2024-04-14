import figures.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        someFiguresMagic();

    }

    public static void someFiguresMagic() {
        ArrayList<GeomFigure> figures = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            figures.add(new SquareFigure(random.nextInt(10)));
            figures.add(new Triangle(random.nextInt(10), random.nextInt(10)));
            figures.add(new Round(random.nextInt(10)));
        }

        double totalArea = 0;
        for (GeomFigure figure : figures) {
            totalArea += figure.area();
        }
        System.out.println("Total area: " + totalArea);
    }
}