package obstacles;

public class Wall implements Obstacle {
     private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void overcome() {
        System.out.println("Wall is overcome");
    }
}
