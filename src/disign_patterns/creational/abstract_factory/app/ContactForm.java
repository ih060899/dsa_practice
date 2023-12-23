package disign_patterns.creational.abstract_factory.app;

import disign_patterns.creational.abstract_factory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createTextButton().render();
        factory.createButton().render();
    }
}
