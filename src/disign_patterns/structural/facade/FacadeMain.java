package disign_patterns.structural.facade;

public class FacadeMain {
    public static void main(String[] args) {
       NotificationService service = new NotificationService();
       service.send("Hello World", "target");
    }
}
