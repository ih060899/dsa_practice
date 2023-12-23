package disign_patterns.creational.factory_method.sharp;

import disign_patterns.creational.factory_method.matcha.Controller;
import disign_patterns.creational.factory_method.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
