package disign_patterns.structural.proxy;

public class EbookProxy implements EBook {
    private String fileName;
    private RealEBook ebook;

    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (ebook == null)
            ebook = new RealEBook(fileName);
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
