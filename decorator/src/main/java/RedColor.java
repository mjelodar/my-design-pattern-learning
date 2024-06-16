public class RedColor extends ShapeDecorator{
    public RedColor(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("color = red");
    }
}
