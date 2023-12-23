package disign_patterns.creational.abstract_factory;

import disign_patterns.creational.abstract_factory.app.ContactForm;
import disign_patterns.creational.abstract_factory.material.MaterialWidgetFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        ContactForm form = new ContactForm();
        form.render(new MaterialWidgetFactory());
    }
}
