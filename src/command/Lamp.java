package command;

public class Lamp implements Device {

    private boolean on;

    @Override
    public void switchOn() {
        System.out.println("La lampe est allumée !");
        this.on = true;
    }

    @Override
    public void switchOff() {
        System.out.println("La lampe est éteinte !");
        this.on = false;
    }

    @Override
    public void flash() {
        while (true) {
            switchOn();
            switchOff();
        }
    }
}
