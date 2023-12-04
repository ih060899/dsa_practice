package problem;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int sum = 0;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        ListNode listNode1 = new ListNode(4, listNode);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(6, listNode3);
        ListNode listNode5 = new ListNode(5, listNode4);
        var result = addTwoNumbers(listNode2, listNode5);
        System.out.println(result);

    }


    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
