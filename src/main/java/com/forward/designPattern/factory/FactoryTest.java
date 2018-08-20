package com.forward.designPattern.factory;

public class FactoryTest {

    public static void main(String[] args) {
        Shape shape = new ShapeFactory().getShape("circle1");

        shape.deaw();
    }
}
