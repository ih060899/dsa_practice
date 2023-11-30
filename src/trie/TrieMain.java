package trie;

public class TrieMain {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("car");
        trie.insert("care");
        trie.insert("card");
        trie.insert("careful");
        trie.insert("egg");
//        System.out.println(trie.contains("can"));
//        trie.traversePreOrder();
//        trie.traversePostOrder();
//        trie.remove("book");

//        System.out.println(trie.contains("car"));
//        System.out.println(trie.contains("care"));

        System.out.println(trie.findWords(null));

    }
}
