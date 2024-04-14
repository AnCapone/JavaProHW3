package obstacles;

public class RunningTrack implements Obstacles {
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void overcome() {
        System.out.println("Running track is overcome");
    }
}
