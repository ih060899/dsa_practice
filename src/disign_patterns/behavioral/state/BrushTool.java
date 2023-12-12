package disign_patterns.behavioral.state;

public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brash icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
