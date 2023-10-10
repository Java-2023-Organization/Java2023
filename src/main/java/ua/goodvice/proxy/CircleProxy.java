package ua.goodvice.proxy;

import ua.goodvice.composite.GraphicObject;
import ua.goodvice.composite.primitive.Circle;

public class CircleProxy implements GraphicObject {
    private GraphicObject realGraphicObject;


    @Override
    public void draw() {
        if (realGraphicObject == null) {
            realGraphicObject = new Circle();
        }
        realGraphicObject.draw();
    }
}
