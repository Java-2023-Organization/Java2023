package ua.goodvice;

import ua.goodvice.composite.CompositeGraphicObject;
import ua.goodvice.composite.GraphicObject;
import ua.goodvice.decorator.ColorDecorator;
import ua.goodvice.decorator.SizeDecorator;
import ua.goodvice.proxy.CircleProxy;
import ua.goodvice.proxy.QuadrilateralProxy;

public class Runner {
    public static void main(String[] args) {
        CompositeGraphicObject compositeGraphicObject = new CompositeGraphicObject();

        GraphicObject circle = new CircleProxy();
        circle = new ColorDecorator(circle, "blue");
        circle = new SizeDecorator(circle, 26);
        compositeGraphicObject.add(circle);

        GraphicObject rectangle = new QuadrilateralProxy();
        rectangle = new ColorDecorator(rectangle, "purple");
        rectangle = new SizeDecorator(rectangle, 11);
        compositeGraphicObject.add(rectangle);

        compositeGraphicObject.draw();
    }

}
