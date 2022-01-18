package problems;

/**
 * A Binary Search Tree (BST) is a hierarchical data structure that consists of vertices connected through edges.
 * The value of the left node is less than the value of the parent node,
 * and the value of the right node is greater than the value of the parent node.
 */
public class BinarySearchTree {
    //Variables
    private Node root;

    //Getter for Root
    public Node getRoot() {
        return root;
    }

    //Setter for root
    public void setRoot(Node root) {
        this.root = root;
    }

    //Recursive function to insert a value in BST
    public Node recursive_insert(Node currentNode, int value) {

        //Base Case
        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.getValue()) {
            //Iterate left sub-tree
            currentNode.setLeftChild(recursive_insert(currentNode.getLeftChild(), value));
        } else if (value > currentNode.getValue()) {
            //Iterate right sub-tree
            currentNode.setRightChild(recursive_insert(currentNode.getRightChild(), value));
        } else {
            // value already exists
            return currentNode;
        }

        return currentNode;
    }

    //Function to call recursive insert
    public boolean insert(int value) {
        root = recursive_insert(this.root, value);
        return true;
    }

    //Function to check if Tree is empty or not
    public boolean isEmpty() {
        return root == null; //if root is null then it means Tree is empty
    }

    //Just for Testing purpose
    public void printTree(Node current) {

        if (current == null) return;

        System.out.print(current.getValue() + ",");
        printTree(current.getLeftChild());
        printTree(current.getRightChild());

    }

    public static void main(String args[]) {

        BinarySearchTree bsT = new BinarySearchTree();
        bsT.insert(6);
        bsT.insert(4);
        bsT.insert(8);
        bsT.insert(5);
        bsT.insert(2);
        bsT.insert(8);
        bsT.insert(12);
        bsT.insert(10);
        bsT.insert(14);
        bsT.printTree(bsT.getRoot());

    }

    class Node {

        int value;
        Node leftChild;
        Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

    }
}

