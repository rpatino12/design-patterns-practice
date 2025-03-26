package org.example.trees;

import java.awt.*;

/**
 * Contains state unique for each tree
 * */
public class Tree {
    // Extrinsic state of objects, it's different for each object
    private int x;
    private int y;

    // This is a reference to the Flyweight object (stores the intrinsic state)
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        this.type.draw(g, this.x, this.y);
    }
}
