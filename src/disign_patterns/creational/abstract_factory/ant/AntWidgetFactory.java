package disign_patterns.creational.abstract_factory.ant;

import disign_patterns.creational.abstract_factory.Button;
import disign_patterns.creational.abstract_factory.TextBox;
import disign_patterns.creational.abstract_factory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextButton() {
        return new AndTextBox();
    }
}
