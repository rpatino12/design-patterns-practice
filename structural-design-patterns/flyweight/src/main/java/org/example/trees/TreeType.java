package org.example.trees;

import java.awt.*;
/**
 * Flyweight: Contains state shared by several trees
 * */
public class TreeType {
    // Intrinsic state of the objects, it is shared by multiple trees of the same type
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
