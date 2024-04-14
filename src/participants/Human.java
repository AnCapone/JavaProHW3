package participants;

public class Human implements Participants{
    private int limitRun;
    private int limitJump;
    private String name;

    public Human(String name, int limitRun, int limitJump) {
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
        System.out.println("Human is running");
    }

    @Override
    public void jump() {
        System.out.println("Human is jumping");
    }
}
