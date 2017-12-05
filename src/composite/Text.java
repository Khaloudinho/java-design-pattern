package composite;

public class Text implements Graphic {
    @Override
    public void draw() {
        System.out.println("Text");
    }

    @Override
    public void add(Graphic graphic) {

    }

}
