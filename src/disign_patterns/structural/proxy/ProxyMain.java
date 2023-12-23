package disign_patterns.structural.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Library library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (String fileName : fileNames)
            library.add(new LoggingEbookProxy(fileName));
        library.openEbook("c");
    }
}
