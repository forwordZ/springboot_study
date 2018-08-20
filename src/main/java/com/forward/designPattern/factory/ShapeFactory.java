package com.forward.designPattern.factory;

public class ShapeFactory {

    public Shape getShape(String type) {

        if(type == null)
            return null;

        switch (type) {
            case "rectangle":return new Rectangle();
            case "square":return new Square();
            case "circle":return new Circle();
            default:return null;
        }
    }
}
