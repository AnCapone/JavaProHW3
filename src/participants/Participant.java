package participants;

import obstacles.Obstacle;

public interface Participant {
    void run();
    void jump();

    int getLimitRun();

    int getLimitJump();
    String getName();
    boolean isOvercomeObstacle(Obstacle obstacle);
}
