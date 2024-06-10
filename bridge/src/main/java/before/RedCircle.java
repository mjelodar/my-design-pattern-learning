package before;

public class RedCircle extends Circle{
    @Override
    public void draw(int x, int y, int radius) {
        super.draw(x, y, radius);
        System.out.println("this circle is red");
    }
}
