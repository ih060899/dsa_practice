package problem;

import java.util.ArrayList;
import java.util.List;

// 876. Middle of the Linked List

public class MiddleOfTheLinkedList {
    private static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current= current.next;
        }
        current = head;
        for(int i = 0; i< count/2; i++){
            current = current.next;
        }
        return current;
    }

    public static ListNode middleNode1(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            list.add(current);
            current= current.next;
        }

        return list.get(list.size()/2);
    }

    public static ListNode middleNode2(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = middleNode1(node1);
    }
}
