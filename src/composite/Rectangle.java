package composite;

public class Rectangle implements Graphic {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }

    @Override
    public void add(Graphic graphic) {

    }

}
