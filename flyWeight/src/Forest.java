import java.util.ArrayList;
import java.util.List;

public class Forest {
    List<Tree> treeList;
    public static Forest forest;

    private Forest(List<Tree> treeList) {
        this.treeList = treeList;
    }

    public static Forest getInstance(){
        if (forest == null){
            System.out.println("we create a new forest.");
            forest = new Forest(new ArrayList<>());
            return forest;
        }
        System.out.println("There is a forest already.");
        return forest;
    }

    public Tree plantTree(String color, String texture, int x, int y, int height){
        TreesPool pool = TreesPool.getInstance(new ArrayList<>());
        Trees trees = pool.getTrees(color, texture, x, y, height);
        Tree tree = new Tree(x, y, height, trees);
        treeList.add(tree);
        return tree;
    }

    public void draw(Tree tree){
        tree.draw();
    }
}
