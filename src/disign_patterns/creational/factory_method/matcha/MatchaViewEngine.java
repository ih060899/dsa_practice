package disign_patterns.creational.factory_method.matcha;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {
    @Override
    public String render(String view, Map<String, Object> context){
        return "View render by Matcha";
    }
}
