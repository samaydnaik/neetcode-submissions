

class TreeMap {
    TreeNode root;

    class TreeNode {
        TreeNode right;
        TreeNode left;
        int key;
        int value;

        TreeNode(int key, int value) {
            this.key = key;
            this.value = value;
            this.right = null;
            this.left = null;
        }
    }

    public TreeMap() {}

    public void insert(int key, int val) {
        root = insertIntoTree(root, key, val);
    }

    private TreeNode insertIntoTree(TreeNode root, int key, int val) {
        if (root == null) {
            return new TreeNode(key, val);
        }

        if (root.key == key) {
            root.value = val; // FIXED: parameter name is 'val'
            return root;
        }

        // FIXED: replaced old keyValue reference with root.key
        if (key < root.key) {
            root.left = insertIntoTree(root.left, key, val);
        } else {
            root.right = insertIntoTree(root.right, key, val);
        }

        return root;
    }

    public int get(int key) {
        return search(root, key);
    }

    private int search(TreeNode root, int key) {
        if (root == null)
            return -1;

        if (root.key == key)
            return root.value;

        if (key > root.key)
            return search(root.right, key);
        else
            return search(root.left, key);
    }

    public int getMin() {
        if (root == null) return -1;
        TreeNode curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr.value;
    }

    public int getMax() {
        if (root == null) return -1;
        TreeNode curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr.value;
    }

    public void remove(int key) {
        root = removeKey(root, key);
    }

    public TreeNode removeKey(TreeNode root, int key) {
        if (root == null) return root;

        if (key > root.key) {
            root.right = removeKey(root.right, key);
        } else if (key < root.key) {
            root.left = removeKey(root.left, key);
        } else {
            if (root.right == null) return root.left;
            if (root.left == null) return root.right;

            TreeNode curr = root.right;

            while (curr.left != null) {
                curr = curr.left;
            }

            // FIXED: Copy key and value correctly from inorder successor
            root.key = curr.key;
            root.value = curr.value;
            // FIXED: Correct method name and passing the new root.key
            root.right = removeKey(root.right, root.key);
        }

        return root; // FIXED: added missing return statement
    }

    public List<Integer> getInorderKeys() {
        List<Integer> keysInOrder = new ArrayList<>();
        inorderTraversal(root, keysInOrder);
        return keysInOrder;
    }

    private void inorderTraversal(TreeNode root, List<Integer> keysInOrder) {
        if (root == null)
            return;

        inorderTraversal(root.left, keysInOrder);
        keysInOrder.add(root.key);
        inorderTraversal(root.right, keysInOrder);
    }
}