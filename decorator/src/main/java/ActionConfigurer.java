import java.util.Scanner;

public class ActionConfigurer {
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your option");
        String option = myObj.nextLine();
        Shape circle = new Circle();
        ShapeDrawer shapeDrawer;
        circle.draw();

        switch (option){
            case "color":
                Shape redColor = new RedColor(circle);
                shapeDrawer = new ShapeDrawer(redColor);
                shapeDrawer.draw();
                break;
            case "dimension":
                Shape dimension = new ThreeDimention(circle);
                shapeDrawer = new ShapeDrawer(dimension);
                shapeDrawer.draw();
                break;
            case "both":
                Shape redColorBoth = new RedColor(circle);
                shapeDrawer = new ShapeDrawer(redColorBoth);
                shapeDrawer.draw();
                Shape dimensionBoth = new ThreeDimention(circle);
                shapeDrawer = new ShapeDrawer(dimensionBoth);
                shapeDrawer.draw();
                break;
        }
    }
}
