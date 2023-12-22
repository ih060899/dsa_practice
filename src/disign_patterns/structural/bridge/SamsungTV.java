package disign_patterns.structural.bridge;

public class SamsungTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Samsung: turnon");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: turnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Samsung: Set channel");
    }
}
