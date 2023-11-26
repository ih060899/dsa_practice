package binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private Node root;

    public void insert(int value) {
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value)
                current = current.leftChild;
            else if (value > current.value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    public void traverseInOrderDesc() {
        traverseInOrderDesc(root);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.value + " ");
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.print(root.value + " ");
        traverseInOrder(root.rightChild);
    }

    private void traverseInOrderDesc(Node root) {
        if (root == null)
            return;

        traverseInOrderDesc(root.rightChild);
        System.out.print(root.value + " ");
        traverseInOrderDesc(root.leftChild);
    }


    private void traversePostOrder(Node root) {
        if (root == null)
            return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.print(root.value + " ");
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    private static boolean isLeaf(Node root) {
        return root.leftChild == null && root.rightChild == null;
    }

    // O(log n)
    public int min() {
        if (root == null)
            throw new IllegalArgumentException();

        var current = root;
        var last = current;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last.value;
//        return min(root);
    }

    // O(n)
    private int min(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;
        if (isLeaf(root))
            return root.value;
        var left = min(root.leftChild);
        var right = min(root.rightChild);
        return Math.min(root.value, Math.min(left, right));
    }

    public boolean equals(Tree other) {
        if (other == null)
            return false;

        return equals(root, other.root);
    }

    // PreOrder Traversal
    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;
        if (first != null && second != null)
            return first.value == second.value &&
                    equals(first.leftChild, second.leftChild) &&
                    equals(first.rightChild, second.rightChild);

        return false;
    }

    public boolean isBinarySearchTree() {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public void swapRoot() {
        var temp = root.leftChild;
        root.leftChild = root.rightChild;
        root.rightChild = temp;
    }

    // Preorder Traversal
    private boolean isBinarySearchTree(Node root, int min, int max) {
        if (root == null)
            return true;

        if (root.value < min || root.value > max)
            return false;
        return isBinarySearchTree(root.leftChild, min, root.value - 1) &&
                isBinarySearchTree(root.rightChild, root.value + 1, max);
    }

    public List<Integer> getNodesAtDistance(int distance) {
        List<Integer> list = new ArrayList<>();
        getNodesAtDistance(root, distance, list);
        return list;
    }

    private void getNodesAtDistance(Node root, int distance, List<Integer> list) {
        if (root == null)
            return;

        if (distance == 0) {
            list.add(root.value);
            return;
        }

        getNodesAtDistance(root.leftChild, distance - 1, list);
        getNodesAtDistance(root.rightChild, distance - 1, list);
    }

    // Breadth First
    public void traverseLevelOrder(){
        for (int i = 0; i <= height(); i++) {
            for (int value: getNodesAtDistance(i)) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }


    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node= " + value;
        }
    }
}
