package command;

public class Lamp implements Device {

    private boolean on;

    @Override
    public void switchOn() {
        System.out.println("The lamp is on !");
        this.on = true;
    }

    @Override
    public void switchOff() {
        System.out.println("The lamp is off !");
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
