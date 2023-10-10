package ua.goodvice.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphicObject implements GraphicObject {
    private final List<GraphicObject> children = new ArrayList<>();

    public void add(GraphicObject child) {
        children.add(child);
    }

    public void remove(GraphicObject child) {
        children.remove(child);
    }

    @Override
    public void draw() {
        children.forEach(GraphicObject::draw);
    }
}
