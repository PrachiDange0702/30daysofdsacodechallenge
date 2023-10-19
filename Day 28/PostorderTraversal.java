class Tree {
    // Function to return a list containing the postorder traversal of the tree.
    public static ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> postorder = new ArrayList<>();
        if (root == null) {
            return postorder;
        }

        // Recursively traverse the left subtree.
        postorder.addAll(postOrder(root.left));

        // Recursively traverse the right subtree.
        postorder.addAll(postOrder(root.right));

        // Add the root node to the postorder list.
        postorder.add(root.data);

        return postorder;
    }
