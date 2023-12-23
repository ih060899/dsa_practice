package disign_patterns.creational.prototype;

public class ContextMenu {
    public void duplicate(Component component){
        Component newComponent = component.clone();
        newComponent.render();
    }
}
