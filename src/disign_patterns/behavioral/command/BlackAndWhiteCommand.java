package disign_patterns.behavioral.command;

import disign_patterns.behavioral.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White");
    }
}
