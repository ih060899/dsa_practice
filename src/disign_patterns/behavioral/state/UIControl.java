package disign_patterns.behavioral.state;

public abstract class UIControl {
    public void enable(){
        System.out.println("Enabled");
    }

    public abstract void draw();
}
