package datastructure.binarytree;

/**
 * @author s2it_jsilveira
 * @version $Revision: $<br/>
 * $Id: $
 * @since 18/12/18 20:26
 */
public class BinarySearchTree {

    class Node {
        int key;
        String value;
        Node left;
        Node right;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public Node min() {
            if (left == null) {
                return this;
            } else {
                return left.min();
            }
        }
    }

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public String find(int key) {
        Node node = find(root, key);
        return node == null ? null : node.value;
    }

    private Node find(Node node, int key) {
        if (node == null || node.key == key) {
            return node;
        } else if (key < node.key) {
            return find(node.left, key);
        } else if (key > node.key) {
            return find(node.right, key);
        }
        return null;
    }

    public void insert(int key, String value) {
        root = insertNode(root, key, value);
    }

    public Node insertNode(Node node, int key, String value) {
        if(key == node.key){
            throw new IllegalArgumentException("The key already exists");
        }
        if (node == null) {
            node = new Node(key, value);
            return node;
        }
        if (key < node.key) {
            node.left = insertNode(node.left, key, value);
        } else {
            node.right = insertNode(node.right, key, value);
        }
        return node;
    }

}
