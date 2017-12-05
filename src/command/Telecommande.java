package command;

import java.util.ArrayList;
import java.util.List;

public class Telecommande {

    private List<Command> command;

    public Telecommande() {
        this.command = new ArrayList<>();
    }

    public void performAllCommands(){
        for (Command c : this.command){
            c.executer();
        }
    }

    public void addCommand(Command command){
        this.command.add(command);
    }

    public List<Command> getCommand() {
        return command;
    }

    public void setCommand(List<Command> command) {
        this.command = command;
    }

}
