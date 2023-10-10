package ua.goodvice.decorator;

import ua.goodvice.composite.GraphicObject;

public class SizeDecorator implements GraphicObject{
    private final GraphicObject decoratedObject;
    private final int size;

    public SizeDecorator(GraphicObject decoratedObject, int size) {
        this.decoratedObject = decoratedObject;
        this.size = size;
    }

    @Override
    public void draw() {
        decoratedObject.draw();
        System.out.println("   Розмір - " + size + "px.");
    }
}
