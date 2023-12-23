package disign_patterns.structural.proxy;

public class LoggingEbookProxy implements EBook {
    private String fileName;
    private RealEBook eBook;

    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (eBook == null)
            eBook = new RealEBook(fileName);
        System.out.println("Logging");
        eBook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
