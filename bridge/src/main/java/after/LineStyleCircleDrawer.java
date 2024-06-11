package after;

public class LineStyleCircleDrawer implements ShapeDrawer{
    @Override
    public void drawShape(int x, int y, int radius) {
        System.out.println("this is a dotted circle with radius " + radius);
    }
}
