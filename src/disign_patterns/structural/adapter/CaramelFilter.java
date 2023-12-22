package disign_patterns.structural.adapter;

import disign_patterns.structural.adapter.avaFilter.Caramel;

public class CaramelFilter implements Filter {
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
