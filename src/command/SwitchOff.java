package command;

public class SwitchOff implements Command {

    private Device device;

    public SwitchOff(Device device) {
        this.device = device;
    }

    public void switchOff(Device device){
        this.device = device;
    }

    @Override
    public void run() {
        this.device.switchOff();
    }
}
