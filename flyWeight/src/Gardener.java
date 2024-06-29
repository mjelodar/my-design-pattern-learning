import java.util.ArrayList;

public class Gardener {
    Forest forest;

    public void createForrest(String color, String texture, int x, int y, int hieght){
        forest = Forest.getInstance();
        Tree tree = forest.plantTree(color, texture, x, y, hieght);
        forest.draw(tree);
    }
}
