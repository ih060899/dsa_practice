package disign_patterns.behavioral.command;

import disign_patterns.behavioral.command.editor.BoldCommand;
import disign_patterns.behavioral.command.editor.History;
import disign_patterns.behavioral.command.editor.HtmlDocument;
import disign_patterns.behavioral.command.editor.UndoCommand;

public class CommandMain {
    public static void main(String[] args) {
//        CustomerService customerService = new CustomerService();
//        Command command = new AddCustomerCommand(customerService);
//        Button button = new Button(command);
//        button.click();

//        CompositeCommand compositeCommand = new CompositeCommand();
//        compositeCommand.add(new ResizeCommand());
//        compositeCommand.add(new BlackAndWhiteCommand());
//        compositeCommand.execute();
//        compositeCommand.execute();

        History history = new History();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello World");

        BoldCommand boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());
//        boldCommand.unexecute();
        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
