package after;

public class GreenCircleDrawer implements ShapeDrawer{
    @Override
    public void drawShape(int x, int y, int radius) {
        System.out.println("this is a green circle with radius " + radius);
    }
}
