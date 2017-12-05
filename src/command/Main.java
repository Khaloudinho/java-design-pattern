package command;

public class Main {
    public static void main(String[] args){

        Device lamp = new Lamp();

        Command switchOn = new SwitchOff(lamp);
        Command switchOff = new SwitchOff(lamp);

        Remote t = new Remote();
        t.addCommand(switchOn);
        t.addCommand(switchOff);

        t.performAllCommands();

    }
}
