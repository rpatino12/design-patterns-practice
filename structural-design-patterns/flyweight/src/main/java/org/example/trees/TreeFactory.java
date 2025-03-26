package org.example.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Encapsulates complexity of flyweight creation
 * */
public class TreeFactory {
    // This is a pool of flyweight objects
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
