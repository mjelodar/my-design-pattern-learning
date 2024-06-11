package after;

public class Red3DCircleDrawer implements ShapeDrawer{
    @Override
    public void drawShape(int x, int y, int radius) {
        System.out.println("this is a red-3D circle with radius " + radius);
    }
}
