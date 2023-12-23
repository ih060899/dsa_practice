package disign_patterns.creational.abstract_factory.material;

import disign_patterns.creational.abstract_factory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
