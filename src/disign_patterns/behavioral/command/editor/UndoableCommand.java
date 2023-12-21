package disign_patterns.behavioral.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
