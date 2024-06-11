package before;

public class Action {
    public static void main(String[] args) {
        Circle redCircle = new Circle();
        redCircle.draw(0, 0, 6, "black", true);

        System.out.println();

        Square square = new Square();
        square.draw(4, 5, 0, "blue", false);

        System.out.println();

        Circle yellowCircle = new Circle();
        yellowCircle.draw(0, 0, 15, "brown", false);
    }
}
