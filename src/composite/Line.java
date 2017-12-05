package composite;

public class Line implements Graphic {

    @Override
    public void draw() {
        System.out.println("Line");
    }

    @Override
    public void add(Graphic graphic) {

    }

}
