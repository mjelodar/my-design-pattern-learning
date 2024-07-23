public class ThreeDimention extends ShapeDecorator{
    public ThreeDimention(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setDimension(4);
    }

    private void setDimension(int dimension){
        System.out.println("dimension = " + dimension);
    }
}
