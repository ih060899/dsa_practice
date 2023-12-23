package disign_patterns.creational.abstract_factory.material;

import disign_patterns.creational.abstract_factory.Button;
import disign_patterns.creational.abstract_factory.TextBox;
import disign_patterns.creational.abstract_factory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextButton() {
        return new MaterialTextBox();
    }
}
