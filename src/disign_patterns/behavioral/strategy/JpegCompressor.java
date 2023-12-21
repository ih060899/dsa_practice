package disign_patterns.behavioral.strategy;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPEG");
    }
}