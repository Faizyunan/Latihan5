
public class BinaryTree {
    public Node root;

    public void newNode(int data) {
        root = insertNode(root, new Node(data));
    }

    private Node insertNode(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
            return root;
        }
        if (newNode.data < root.data) {
            root.left = insertNode(root.left, newNode);
        } else {
            root.right = insertNode(root.right, newNode);
        }
        return root;
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.newNode(20);
        binaryTree.newNode(2);
        binaryTree.newNode(25);
        binaryTree.newNode(37);
        binaryTree.newNode(16);
      

        System.out.println("In-order traversal:");
        binaryTree.inOrder(binaryTree.root);

        System.out.println("\nPre-order traversal:");
        binaryTree.preOrder(binaryTree.root);

        System.out.println("\nPost-order traversal:");
        binaryTree.postOrder(binaryTree.root);
    }

    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}