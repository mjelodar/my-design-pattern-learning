package before;

public class Square extends Shape{
    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("this is a square with x " + x + " and y " + y);
    }
}
