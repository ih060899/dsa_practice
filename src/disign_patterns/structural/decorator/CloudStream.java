package disign_patterns.structural.decorator;

public class CloudStream implements Stream{
    @Override
    public void write(String data){
        System.out.println("Storing " + data);
    }
}
