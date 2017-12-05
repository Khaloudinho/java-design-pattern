package command;

public class Flash implements Command {

    private Device device;

    public Flash(Device device) {
        this.device = device;
    }

    public void flash(Device device) {
        this.device = device;
    }

    @Override
    public void run() {
        this.device.flash();
    }
}
