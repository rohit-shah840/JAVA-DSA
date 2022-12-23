import java.util.ArrayDeque;
//import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeImplementation {
    private Node root;

    private class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // creating a binary tree
    public void createBinaryTree() {
        Node newNode1 = new Node(1);
        Node newNode2 = new Node(2);
        Node newNode3 = new Node(3);
        Node newNode4 = new Node(4);
        Node newNode5 = new Node(5);
        Node newNode6 = new Node(6);

        root = newNode1;
        newNode1.left = newNode2;
        newNode1.right = newNode3;
        newNode2.left = newNode4;
        newNode2.right = newNode5;
        newNode3.left = newNode6;
    }

    // recursive pre-order traversal
    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // recursive IN-order traversal
    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    // recursive Post-order traversal
    public void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

    // Iterative pre-order traversal
    public void preOrderIterative() {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.println(temp.data);
            if (temp.right != null)
                stack.push(temp.right);
            if (temp.left != null)
                stack.push(temp.left);
        }
    }

    // Iterative in-order traversal
    public void inOrderIterative() {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.println(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    // Iterative post-order traversal
    public void postOrderIterative() {
        if (root == null) {
            return;
        }
        Node curr = root;
        Stack<Node> stack = new Stack<>();
        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                Node temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.println(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.println(temp.data + " ");
                    }
                } else {
                    curr = temp;
                }
            }
        }
    }

    // Level-order traversal
    public void levelOrderTraversal(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.println(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null)
                queue.offer(temp.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeImplementation b = new BinaryTreeImplementation();
        b.createBinaryTree();
        // b.preOrder(b.root);
        b.preOrderIterative();
        System.out.println();
        b.inOrder(b.root);
        // b.inOrderIterative();
        System.out.println();
        // b.postOrder(b.root);
        b.postOrderIterative();
        System.out.println();
        b.levelOrderTraversal(b.root);
    }

}
