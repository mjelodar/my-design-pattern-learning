package after;

public class Action {
    public static void main(String[] args) {
        ShapeDrawer redCircleDrawer = new RedCircleDrawer();
        Circle redCircle = new Circle(10, redCircleDrawer);
        redCircle.draw();

        GreenCircleDrawer greenCircleDrawer = new GreenCircleDrawer();
        Circle greenCircle = new Circle(15, greenCircleDrawer);
        greenCircle.draw();

        ShapeDrawer red3DCircleDrawer = new Red3DCircleDrawer();
        Circle red3DCircle = new Circle(10, red3DCircleDrawer);
        red3DCircle.draw();

        ShapeDrawer dottedCircleDrawer = new LineStyleCircleDrawer();
        Circle dottedCircle = new Circle(50, dottedCircleDrawer);
        dottedCircle.draw();
    }
}
