public class ColoredShape extends ShapeDecorator{
    public ColoredShape(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setColor("RED");
    }

    public void setColor(String color){
        System.out.println("color = " + color);
    }
}
