package disign_patterns.creational.factory_method;

import disign_patterns.creational.factory_method.matcha.Controller;
import disign_patterns.creational.factory_method.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductController extends SharpController {
    public void listProduct(){
        // Get products form a database
        Map<String, Object> context = new HashMap<>();
        // context.put(products)
        render("product.html", context);

    }
}
