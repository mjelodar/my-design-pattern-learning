package after;

public class Circle extends Shape{
    int radius;
    public Circle(int radius, ShapeDrawer shapeDrawer) {
        super(shapeDrawer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("this a circle with radius " + radius + " with some specification: ");
        shapeDrawer.drawShape();
    }
}
