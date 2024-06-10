package before;

public class BlueCircle extends Circle{
    @Override
    public void draw(int x, int y, int radius) {
        super.draw(x, y, radius);
        System.out.println("this circle is blue");
    }
}
