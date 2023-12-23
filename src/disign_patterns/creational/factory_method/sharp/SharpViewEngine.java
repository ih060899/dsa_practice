package disign_patterns.creational.factory_method.sharp;

import disign_patterns.creational.factory_method.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String view, Map<String, Object> context) {
        return "View rendered by Sharp";
    }
}
