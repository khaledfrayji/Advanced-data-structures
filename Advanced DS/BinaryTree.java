class BinaryTreeNode {
    int value;
    BinaryTreeNode left, right;

    BinaryTreeNode(int item) {
        value = item;
        left = right = null;
    }
}

class BinaryTree {
    BinaryTreeNode root;

    BinaryTree() {
        root = null;
    }

    void add(int value) {
        root = addRecursive(root, value);
    }

    private BinaryTreeNode addRecursive(BinaryTreeNode node, int value) {
        if (node == null) {
            return new BinaryTreeNode(value);
        }

        if (value < node.value) {
            node.left = addRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = addRecursive(node.right, value);
        }

        return node;
    }

    boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private boolean containsNodeRecursive(BinaryTreeNode node, int value) {
        if (node == null) {
            return false;
        }
        if (value == node.value) {
            return true;
        }
        return value < node.value
          ? containsNodeRecursive(node.left, value)
          : containsNodeRecursive(node.right, value);
    }
}
