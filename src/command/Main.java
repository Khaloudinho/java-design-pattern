package command;

public class Main {
    public static void main(String[] args){

        AppareilElectronique lampe = new Lampe();

        Command allumer = new Allumer(lampe);
        Command eteindre = new SwitchOff(lampe);
        Command clignoter = new Clignoter(lampe);

        Remote t = new Remote();
        t.addCommand(allumer);
        t.addCommand(eteindre);
        // t.addCommand(clignoter);

        t.performAllCommands();

    }
}
