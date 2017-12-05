package command;

public class Main {
    public static void main(String[] args){

        AppareilElectronique lampe = new Lampe();

        Command allumer = new Allumer(lampe);
        Command eteindre = new Eteindre(lampe);
        Command clignoter = new Clignoter(lampe);

        Telecommande t = new Telecommande();
        t.addCommand(allumer);
        t.addCommand(eteindre);
        // t.addCommand(clignoter);

        t.performAllCommands();

    }
}
