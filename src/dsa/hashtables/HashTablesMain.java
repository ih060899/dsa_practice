package dsa.hashtables;

public class HashTablesMain {
    public static void main(String[] args) {
//        System.out.println(CharFinder.findFirstNonRepeatingChar("a green apple"));
//        System.out.println(CharFinder.findFirstRepeatedChar("a green apple"));

        HashTable table = new HashTable();
        table.put(6, "A");
        table.put(8, "B");
        table.put(11, "C");
        table.put(6, "A+");
//        table.remove(60);

        System.out.println(table.get(6));

    }
}
