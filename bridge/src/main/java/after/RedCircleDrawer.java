package after;

public class RedCircleDrawer implements ShapeDrawer{
    @Override
    public void drawShape(int x, int y, int radius) {
        System.out.println("this is a red circle with radius " + radius);
    }
}
