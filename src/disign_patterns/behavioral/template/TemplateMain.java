package disign_patterns.behavioral.template;

public class TemplateMain {
    public static void main(String[] args) {
        Task task = new TransferMoneyTask();
        task.execute();
    }
}
