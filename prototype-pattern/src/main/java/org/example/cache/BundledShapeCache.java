package org.example.cache;

import org.example.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public Shape register(String key, Shape shape) {
        return cache.put(key, shape);
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
