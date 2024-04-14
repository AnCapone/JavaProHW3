package participants;

public class Robot implements Participants {
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
}
