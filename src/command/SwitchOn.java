package command;

public class SwitchOn implements Command {

    private Device device;

    public SwitchOn(Device device) {
        this.device = device;
    }

    public void switchOn(Device device){
        this.device = device;
    }

    @Override
    public void run() {
        this.device.switchOn();
    }
}
