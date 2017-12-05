package command;

import java.util.ArrayList;
import java.util.List;

public class Remote {

    private List<Command> command;

    public Remote() {
        this.command = new ArrayList<>();
    }

    public void performAllCommands(){
        for (Command c : this.command) c.run();
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
