package structural.flyweight.code;

import java.util.HashMap;
import java.util.Map;

public class TreeModelFactory {

    private Map<String, TreeModel> cache = new HashMap<>();

    public TreeModel getTreeModel(String type) {
        if (cache.containsKey(type)) {
            System.out.println("Getting TreeModel of type " + type + " from cache");
            return cache.get(type);
        }

        System.out.println("Creating new TreeModel of type " + type + ".");
        TreeModel treeModel = new TreeModel(type, "", "");
        cache.put(type, treeModel);
        return treeModel;
    }
}
