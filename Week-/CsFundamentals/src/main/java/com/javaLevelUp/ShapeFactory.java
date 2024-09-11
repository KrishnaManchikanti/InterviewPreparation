package com.javaLevelUp;

/**
 * Create a Shape interface with methods draw().
 * Implement two classes Circle and Rectangle that implement the Shape interface.
 * Then create a ShapeFactory class with a method getShape(String shapeType) to return instances of Circle or Rectangle.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
