package composite;

import java.util.List;

public class Picture implements Graphic {

    private List<Graphic> graphics;

    public Picture(List<Graphic> graphics) {
        this.graphics = graphics;
    }

    @Override
    public void draw() {
        for (Graphic graphic : graphics) graphic.draw();
    }

    @Override
    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

}
