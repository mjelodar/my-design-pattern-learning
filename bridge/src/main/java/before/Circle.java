package before;

public class Circle extends Shape{
    @Override
    public void draw(int x, int y, int radius, String color, boolean is3d) {
        String threeD = is3d?"-3D":"";
        System.out.println("this is a " + color + threeD + " circle with radius " + radius);
    }
}
