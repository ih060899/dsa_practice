package disign_patterns.creational.abstract_factory.ant;

import disign_patterns.creational.abstract_factory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
