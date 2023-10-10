package ua.goodvice.composite.primitive;

import ua.goodvice.composite.GraphicObject;

public class Quadrilateral implements GraphicObject {

    @Override
    public void draw() {
        System.out.println("\nВідображення чотирикутника. ");
    }
}
