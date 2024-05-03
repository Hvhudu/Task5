package ru.cs.aisd2024.kuleshov_p_e.Task5_23;

public class BynaryTree {
    private class Node{
        private int value;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    private Node root;
    public void addValue(int value){
        if(root == null) {
            root = new Node(value);
            return;
        }

        add(value, this.root);
    }
    private void add(int value, Node root) {
        if (value < root.value) {
            if(root.left == null) {
                root.left = new Node(value);
                return;
            }
            add(value, root.left);
        } else if (value > root.value) {
            if(root.right == null) {
                root.right = new Node(value);
                return;
            }
            add(value, root.right);
        }
    }
}
