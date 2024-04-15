import figures.*;
import participants.*;
import obstacles.*;


import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        someFiguresMagic();
        startCompetition();

    }

    public static void someFiguresMagic() {
        ArrayList<GeomFigure> figures = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            figures.add(new SquareFigure(random.nextInt(10) + 1));
            figures.add(new Triangle(random.nextInt(10) + 1, random.nextInt(10) + 1));
            figures.add(new Round(random.nextInt(10) + 1));
        }

        double totalArea = 0;
        for (GeomFigure figure : figures) {
            totalArea += figure.area();
        }
        System.out.println("Total area: " + totalArea);
    }

    public static ArrayList<Participant> createParticipantsList() {
        ArrayList<Participant> participants = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            participants.add(new Human("Human" + random.nextInt(1000), random.nextInt(200) + 1, random.nextInt(3) + 1));
            participants.add(new Cat("Cat" + random.nextInt(1000), random.nextInt(150) + 1, random.nextInt(3) + 1));
            participants.add(new Robot("Robot" + random.nextInt(1000), random.nextInt(400) + 1, random.nextInt(4) + 1));
        }

        return participants;
    }

    public static ArrayList<Obstacle> createObstaclesList() {
        ArrayList<Obstacle> obstacles = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            obstacles.add(new Wall(random.nextInt(2) + 1));
            obstacles.add(new RunningTrack(random.nextInt(200) + 1));
        }

        return obstacles;
    }

    public static void startCompetition() {
        ArrayList<Participant> participants = createParticipantsList();
        ArrayList<Obstacle> obstacles = createObstaclesList();
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!participant.isOvercomeObstacle(obstacle)) {
                    break;
                }
            }
        }
    }
}