package disign_patterns.creational.abstract_factory.material;

import disign_patterns.creational.abstract_factory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
