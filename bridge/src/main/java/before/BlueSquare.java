package before;

public class BlueSquare extends Circle{
    @Override
    public void draw(int x, int y, int radius) {
        super.draw(x, y, radius);
        System.out.println("this square is Blue");
    }
}
