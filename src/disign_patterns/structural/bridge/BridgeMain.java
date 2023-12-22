package disign_patterns.structural.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(new SamsungTV());
        remoteControl.turnOn();
    }
}
