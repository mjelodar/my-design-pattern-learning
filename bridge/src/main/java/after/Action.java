package after;

public class Action {
    public static void main(String[] args) {
        ShapeDrawer redCircleDrawer = new RedDrawer();
        Circle redCircle = new Circle(10, redCircleDrawer);
        redCircle.draw();

        GreenDrawer greenCircleDrawer = new GreenDrawer();
        Circle greenCircle = new Circle(15, greenCircleDrawer);
        greenCircle.draw();

        ShapeDrawer red3DCircleDrawer = new DimensionDrawer();
        Circle red3DCircle = new Circle(10, red3DCircleDrawer);
        red3DCircle.draw();

        ShapeDrawer dottedCircleDrawer = new LineStyleDrawer();
        Circle dottedCircle = new Circle(50, dottedCircleDrawer);
        dottedCircle.draw();
    }
}
