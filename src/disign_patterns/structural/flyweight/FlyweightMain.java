package disign_patterns.structural.flyweight;

public class FlyweightMain {
    public static void main(String[] args) {
        PointService service = new PointService(new PointIconFactory());
        for (Point point : service.getPoints()) {
            point.draw();
        }
    }
}
