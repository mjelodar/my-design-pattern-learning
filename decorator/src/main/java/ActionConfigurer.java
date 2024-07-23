import java.util.Scanner;

public class ActionConfigurer {
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your option");
        String option = myObj.nextLine();
//        Shape circle = new Circle();
        ShapeDrawer shapeDrawer;
//        shapeDrawer.draw();

        switch (option){
            case "color":
                Shape redColor = new ColoredShape(new Circle());
                shapeDrawer = new ShapeDrawer(redColor);
                shapeDrawer.draw();
                break;
            case "dimension":
                Shape dimension = new ThreeDimention(new Circle());
                shapeDrawer = new ShapeDrawer(dimension);
                shapeDrawer.draw();
                break;
            case "both":
                Shape redColorBoth = new ColoredShape(new ThreeDimention(new Circle()));
                shapeDrawer = new ShapeDrawer(redColorBoth);
                shapeDrawer.draw();
                break;
        }
    }
}
