import java.util.List;

public class TreesPool {
    List<Trees> treesList;
    public static TreesPool treesPool;

    private TreesPool(List<Trees> treesList) {
        this.treesList = treesList;
    }

    public static TreesPool getInstance(List<Trees> treesList){
        if (treesPool == null)
            treesPool = new TreesPool(treesList);
        return treesPool;
    }

    public Trees getTrees(String color, String texture, int x, int y, int height){
        for (Trees treeType: treesList) {
            System.out.println("this is NOT new tree type");
            if (color.equals(treeType.getColor()) && texture.equals(treeType.getTexture()))
                return treeType;
        }
        System.out.println("this is new tree type");
        Trees trees = new Trees(color, texture);
        treesList.add(trees);
        return trees;
    }
}
