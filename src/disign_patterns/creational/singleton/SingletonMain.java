package disign_patterns.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        ConfigManger manger = ConfigManger.getInstance();
        manger.set("name", "Mosh");
        ConfigManger other = ConfigManger.getInstance();
        System.out.println(other.get("name"));
    }
}
