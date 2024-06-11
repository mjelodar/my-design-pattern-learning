package before;

public class Square extends Shape{
    @Override
    public void draw(int x, int y, int radius, String color, boolean is3D) {
        String threeD = is3D?"-3D":"";
        System.out.println("this is a "+ color + threeD + " square with x " + x + " and y " + y);
    }
}
