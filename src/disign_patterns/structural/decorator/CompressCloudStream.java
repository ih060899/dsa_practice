package disign_patterns.structural.decorator;

public class CompressCloudStream implements Stream{
    private Stream stream;

    public CompressCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String compress = compress(data);
        stream.write(compress);
    }

    private String compress(String data){
        return data.substring(0, 5);
    }
}
