package disign_patterns.behavioral.command;

import disign_patterns.behavioral.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
