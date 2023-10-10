package ua.goodvice.proxy;

import ua.goodvice.composite.GraphicObject;
import ua.goodvice.composite.primitive.Quadrilateral;

public class QuadrilateralProxy implements GraphicObject {
    private GraphicObject realGraphicObject;


    @Override
    public void draw() {
        if (realGraphicObject == null) {
            realGraphicObject = new Quadrilateral();
        }
        realGraphicObject.draw();
    }
}
