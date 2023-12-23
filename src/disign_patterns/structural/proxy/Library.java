package disign_patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, EBook> ebooks = new HashMap<>();

    public void add(EBook eBook){
        ebooks.put(eBook.getFileName(), eBook);
    }

    public void openEbook(String fileName){
       ebooks.get(fileName).show();
    }
}
