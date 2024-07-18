package problem;
//21. Merge Two Sorted Lists


import util.ListNode;

public class MergeTwoLists {
    public static void main(String[] args) {

    }
    //    Let’s consider an example where list1 contains [1, 3, 5] and list2 contains [2, 4, 6]:
//
//    Initial Call:
//
//    mergeTwoLists([1, 3, 5], [2, 4, 6])
//list1.val (1) < list2.val (2), so list1.next is set to mergeTwoLists([3, 5], [2, 4, 6])
//    The call returns list1 with its next pointing to the result of mergeTwoLists([3, 5], [2, 4, 6])
//    Second Call:
//
//    mergeTwoLists([3, 5], [2, 4, 6])
//list2.val (2) < list1.val (3), so list2.next is set to mergeTwoLists([3, 5], [4, 6])
//    The call returns list2 with its next pointing to the result of mergeTwoLists([3, 5], [4, 6])
//    Third Call:
//
//    mergeTwoLists([3, 5], [4, 6])
//list1.val (3) < list2.val (4), so list1.next is set to mergeTwoLists([5], [4, 6])
//    The call returns list1 with its next pointing to the result of mergeTwoLists([5], [4, 6])
//    Fourth Call:
//
//    mergeTwoLists([5], [4, 6])
//list2.val (4) < list1.val (5), so list2.next is set to mergeTwoLists([5], [6])
//    The call returns list2 with its next pointing to the result of mergeTwoLists([5], [6])
//    Fifth Call:
//
//    mergeTwoLists([5], [6])
//list1.val (5) < list2.val (6), so list1.next is set to mergeTwoLists([], [6])
//    The call returns list1 with its next pointing to the result of mergeTwoLists([], [6])
//    Sixth Call:
//
//    mergeTwoLists([], [6])
//    list1 is null, so the function returns list2 ([6])
//    Now, the recursive calls start returning, and the merged list is constructed step-by-step as follows:
//
//    The fifth call returns [5, 6]
//    The fourth call returns [4, 5, 6]
//    The third call returns [3, 4, 5, 6]
//    The second call returns [2, 3, 4, 5, 6]
//    The initial call returns [1, 2, 3, 4, 5, 6]
//    Time Complexity
//    The time complexity of this function is
//    𝑂
//            (
//                    𝑛
//+
//        𝑚
//            )
//    O(n+m), where
//    𝑛
//    n is the length of list1 and
//            𝑚
//    m is the length of list2. This is because each node from both lists is processed exactly once.
//
//    Space Complexity
//    The space complexity is
//    𝑂
//            (
//                    𝑛
//+
//        𝑚
//            )
//    O(n+m) due to the recursion stack. In the worst case, the depth of the recursive calls can be the sum of the lengths of both lists (when every node needs to be compared).

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
            }
        }
        if (list1 == null) {
            return list2;
        }
        return list1;
    }
}
