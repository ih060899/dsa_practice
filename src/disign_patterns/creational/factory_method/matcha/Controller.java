package disign_patterns.creational.factory_method.matcha;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context){
        ViewEngine engine = createViewEngine();
        String html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected ViewEngine createViewEngine(){
        return new MatchaViewEngine();
    }
}
