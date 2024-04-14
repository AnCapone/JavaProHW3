package participants;

public class Cat implements Participants {
    private int limitRun;
    private int limitJump;

    public Cat(int limitRun, int limitJump) {
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    public int getLimitRun() {
        return limitRun;
    }

    public int getLimitJump() {
        return limitJump;
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void jump() {
        System.out.println("Cat is jumping");
    }
}
