package before;

public class Circle extends Shape{
    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("this is a circle with radius " + radius);
    }
}
