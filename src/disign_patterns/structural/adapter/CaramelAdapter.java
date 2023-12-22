package disign_patterns.structural.adapter;

import disign_patterns.structural.adapter.avaFilter.Caramel;

public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
