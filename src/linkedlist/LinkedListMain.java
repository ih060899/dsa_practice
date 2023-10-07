package linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(40);
//        list.removeFirst();
//        list.removeLast();
        System.out.println(list.indexOf(100));
        System.out.println(list.contains(50));
        System.out.println(list.size());
    }
}
