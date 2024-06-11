package before;

public class ThreeDCircle extends Circle{
    @Override
    public void draw(int x, int y, int radius) {
        super.draw(x, y, radius);
        System.out.println("This is a 3D circle.");
    }
}
