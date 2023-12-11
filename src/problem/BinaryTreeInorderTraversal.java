package problem;

import java.util.ArrayList;
import java.util.List;

//94. Binary Tree Inorder Traversal
//        Given the root of a binary tree, return the inorder traversal of its nodes' values.
//
//
//
//        Example 1:
//
//
//        Input: root = [1,null,2,3]
//        Output: [1,3,2]
//        Example 2:
//
//        Input: root = []
//        Output: []
//        Example 3:
//
//        Input: root = [1]
//        Output: [1]
//
//
//        Constraints:
//
//        The number of nodes in the tree is in the range [0, 100].
//        -100 <= Node.val <= 100

public class BinaryTreeInorderTraversal {
    static List<Integer> ans = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return ans;
        inorderTraversal(root.left);
        ans.add(root.val);
        return inorderTraversal(root.right);
    }

    public static List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTraversal1(root, res);
        return res;
    }

    public static void inorderTraversal1(TreeNode root, List<Integer> res) {
        if (root != null) {
            inorderTraversal1(root.left, res);
            res.add(root.val);
            inorderTraversal1(root.right, res);
        }
    }

    public static void main(String[] args) {
        var leftNode = new TreeNode(3);
        var rightNode = new TreeNode(2, leftNode, new TreeNode(4));
        var tree = new TreeNode(1, new TreeNode(5, new TreeNode(6), new TreeNode(7)), rightNode);
        System.out.println(inorderTraversal1(tree));
    }

    //    Definition for a binary tree node.
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
