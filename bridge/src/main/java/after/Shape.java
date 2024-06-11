package after;

public abstract class Shape {
    ShapeDrawer shapeDrawer;

    public Shape(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    public abstract void draw();
}
