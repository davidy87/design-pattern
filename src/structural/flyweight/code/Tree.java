package structural.flyweight.code;

public class Tree {

    private int posX;

    private int posY;

    private TreeModel treeModel;

    public Tree(int posX, int posY, TreeModel treeModel) {
        this.posX = posX;
        this.posY = posY;
        this.treeModel = treeModel;
    }
}
