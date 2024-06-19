package structural.flyweight.code;

public class Client {

    public static void main(String[] args) {
        TreeModelFactory factory = new TreeModelFactory();
        factory.getTreeModel("나무 1");
        factory.getTreeModel("나무 2");
        factory.getTreeModel("나무 1");
    }
}
