public class Tree {
    private int x, y;
    private int height;
    private Trees trees;

    public Tree(int x, int y, int height, Trees trees) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.trees = trees;
    }

    public void draw(){
        System.out.println("This is a tree with x: " + this.x + " ,y: " + this.y + " , height: " + this.height);
        this.trees.draw();
    }
}
