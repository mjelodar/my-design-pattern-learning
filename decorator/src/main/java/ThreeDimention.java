public class ThreeDimention extends ShapeDecorator{
    public ThreeDimention(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("dimension = 3");
    }
}
