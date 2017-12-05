package composite;

import java.util.ArrayList;

public class Main {

    private static Graphic graphic = new Picture(new ArrayList<>());

    public static void main(String[] args) {

        graphic.add(new Rectangle());
        graphic.add(new Line());
        graphic.add(new Text());
        graphic.draw();

    }
}
