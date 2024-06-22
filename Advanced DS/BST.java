class BSTNode {
    int key;
    BSTNode left, right;

    public BSTNode(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    BSTNode root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    BSTNode insertRec(BSTNode root, int key) {
        if (root == null) {
            root = new BSTNode(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(BSTNode root, int key) {
        if (root == null) {
            return false;
        }
        if (root.key == key) {
            return true;
        }
        return root.key > key
          ? searchRec(root.left, key)
          : searchRec(root.right, key);
    }
}
