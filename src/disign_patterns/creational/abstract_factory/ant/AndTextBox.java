package disign_patterns.creational.abstract_factory.ant;

import disign_patterns.creational.abstract_factory.TextBox;

public class AndTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
