package disign_patterns.behavioral.state;

public class StateMain {
    public static void main(String[] args) {
//        drawUIControl(new TextBox());
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}
