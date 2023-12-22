package disign_patterns.structural.adapter;

import disign_patterns.structural.adapter.avaFilter.Caramel;

public class AdapterMain {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
