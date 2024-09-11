package com.javaLevelUp;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.printNumSides();


        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.printNumSides();
    }
}
