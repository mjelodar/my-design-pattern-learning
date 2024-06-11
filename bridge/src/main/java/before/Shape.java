package before;

public abstract class Shape {
    int x, y, radius;
    String color;
    boolean is3D;

    public abstract void draw(int x, int y, int radius, String color, boolean is3D);
}
