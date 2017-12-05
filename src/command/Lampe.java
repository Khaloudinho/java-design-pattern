package command;

public class Lampe implements AppareilElectronique {

    private boolean on = false;

    @Override
    public void allumer() {
        System.out.println("La lampe est allumée !");
        this.on = true;
    }

    @Override
    public void eteindre() {
        System.out.println("La lampe est éteinte !");
        this.on = false;
    }

    @Override
    public void clignoter() {
        while (true) {
            allumer();
            eteindre();
        }
    }
}
