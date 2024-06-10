package before;

public class Action {
    public static void main(String[] args) {
        RedCircle redCircle = new RedCircle();
        redCircle.draw(0, 0, 6);

        System.out.println();

        BlueSquare square = new BlueSquare();
        square.draw(4, 5, 0);
    }
}
