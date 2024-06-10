package before;

public class Circle extends Shape{
    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("this is a square with width " + x  + " lentgh " + y);
    }
}
