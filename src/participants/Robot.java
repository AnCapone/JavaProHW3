package participants;

import obstacles.Obstacle;
import obstacles.RunningTrack;
import obstacles.Wall;

public class Robot implements Participant {
    private String name;
    private int limitRun;
    private int limitJump;

    public Robot(String name, int limitRun, int limitJump) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getLimitRun() {
        return limitRun;
    }

    public int getLimitJump() {
        return limitJump;
    }

    @Override
    public void run() {
        System.out.println("Robot is running");
    }

    @Override
    public void jump() {
        System.out.println("Robot is jumping");
    }

    @Override
    public boolean isOvercomeObstacle(Obstacle obstacle) {
        if (obstacle instanceof Wall) {
            if (limitJump >= ((Wall) obstacle).getHeight()) {
                System.out.println("Robot " + name + " overcome the obstacle " + obstacle.getClass().getSimpleName() + " on distance " + ((Wall) obstacle).getHeight());
                return true;
            } else {
                System.out.println("Robot " + name + " did not overcome the obstacle " + obstacle.getClass().getSimpleName() + " on distance " + ((Wall) obstacle).getHeight());
                return false;
            }
        } else if (obstacle instanceof RunningTrack) {
            if (limitRun >= ((RunningTrack) obstacle).getLength()) {
                System.out.println("Robot " + name + " overcome the obstacle " + obstacle.getClass().getSimpleName() + " on distance " + ((RunningTrack) obstacle).getLength());
                return true;
            } else {
                System.out.println("Robot " + name + " did not overcome the obstacle " + obstacle.getClass().getSimpleName() + " on distance " + ((RunningTrack) obstacle).getLength());
                return false;
            }
        }
        return false;
    }
}
