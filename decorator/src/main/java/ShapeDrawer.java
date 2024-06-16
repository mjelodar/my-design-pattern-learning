public class ShapeDrawer {
    Shape shape;

    public ShapeDrawer(Shape shape) {
        this.shape = shape;
    }

    public void draw(){
        shape.draw();
    }

}
