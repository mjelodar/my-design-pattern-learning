package after;

public class Circle extends Shape{
    int radius;
    public Circle(int radius, ShapeDrawer shapeDrawer) {
        super(shapeDrawer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        shapeDrawer.drawShape(0,0, radius);
    }
}
