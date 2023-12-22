package disign_patterns.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
       storeCreditCard(new CompressCloudStream(new EncryptedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream){
        stream.write("1234-1234-1234-1234");
    }
}
