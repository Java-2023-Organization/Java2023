package ua.goodvice.decorator;

import ua.goodvice.composite.GraphicObject;

public class ColorDecorator implements GraphicObject {
    private final GraphicObject decoratedObject;
    private final String color;

    public ColorDecorator(GraphicObject decoratedObject, String color) {
        this.decoratedObject = decoratedObject;
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedObject.draw();
        System.out.println("   Колір - " + color + ".");
    }
}
