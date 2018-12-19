package datastructure.binarytree;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public String find(int key) {
        Node node = find(root, key);
        return node == null ? null : node.getValue();
    }

    private Node find(Node node, int key) {
        if (node == null || node.getKey() == key) {
            return node;
        } else if (key < node.getKey()) {
            return find(node.getLeft(), key);
        } else if (key > node.getKey()) {
            return find(node.getRight(), key);
        }
        return null;
    }

    public void insert(int key, String value) {
        root = insertNode(root, key, value);
    }

    public Node insertNode(Node node, int key, String value) {
        if (node == null) {
            node = new Node(key, value);
            return node;
        }
        if (key == node.getKey()) {
            throw new IllegalArgumentException("The key already exists");
        }
        if (key < node.getKey()) {
            node.setLeft(insertNode(node.getLeft(), key, value));
        } else {
            node.setRight(insertNode(node.getRight(), key, value));
        }
        return node;
    }

    public int findMinKey() {
        return findMin(root).getKey();
    }

    public Node findMin(Node node) {
        return node.min();
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    public Node delete(Node node, int key) {
        if (node == null) {
            return null;
        } else if (key < node.getKey()) {
            node.setLeft(delete(node.getLeft(), key));
        } else if (key > node.getKey()) {
            node.setRight(delete(node.getRight(), key));
        } else if (key == node.getKey()){
            // Case 1: No child
            if (node.getLeft() == null && node.getRight() == null) {
                node = null;
            }

            // Case 2: One child
            else if (node.getLeft() == null) {
                node = node.getRight();
            } else if (node.getRight() == null) {
                node = node.getLeft();
            }

            // Case 3: Two children
            else {
                // Find the minimum node on the right (could also max the left...)
                Node minRight = findMin(node.getRight());

                // Duplicate it by copying its values here
                node.setKey(minRight.getKey());
                node.setValue(minRight.getValue());

                // Now delete the node we just duplicated (same key)
                node.setRight(delete(node.getRight(), node.getKey()));
            }
        }

        return node;
    }

    public void prettyPrint() {
        BTreePrinter.printNode(root);
    }

    public void printInOrderTraversal() {
        inOrderTraversal(root);
    }

    public void printPostOrderTraversal() {
        postOrderTraversal(root);
    }

    public void printPreOrderTraversal() {
        preOrderTraversal(root);
    }

    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.println(node.getKey());
            inOrderTraversal(node.getRight());
        }
    }


    private void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.println(node.getKey());
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
        }
    }

    private void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            System.out.println(node.getKey());
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

}
