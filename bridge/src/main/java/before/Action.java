package before;

public class Action {
    public static void main(String[] args) {
        Circle redCircle = new RedCircle();
        redCircle.draw(0, 0, 6);

        System.out.println();

        Square square = new BlueSquare();
        square.draw(4, 5, 0);

        System.out.println();

        Circle yellowCircle = new YellowCircle();
        yellowCircle.draw(0, 0, 15);
    }
}
