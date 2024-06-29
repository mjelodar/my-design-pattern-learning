public class Trees {
    private String color;
    private String texture;

    public Trees(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public void draw(){
        System.out.println("This is a tree with color :" + this.getColor() + " texture: " + this.getTexture());
    }
}
