package disign_patterns.creational.factory_method.matcha;

import java.util.Map;

public interface ViewEngine {
    String render(String view, Map<String, Object> context);
}
