package disign_patterns.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        ContextMenu menu = new ContextMenu();
        menu.duplicate(new Circle());
    }
}
