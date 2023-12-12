package dsa.trie;

public class TrieMain {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("car");
        trie.insert("care");
        trie.insert("card");
        trie.insert("careful");
        trie.insert("egg");
//        System.out.println(dsa.trie.contains("can"));
//        dsa.trie.traversePreOrder();
//        dsa.trie.traversePostOrder();
//        dsa.trie.remove("book");

//        System.out.println(dsa.trie.contains("car"));
//        System.out.println(dsa.trie.contains("care"));

        System.out.println(trie.findWords("care"));

    }
}
