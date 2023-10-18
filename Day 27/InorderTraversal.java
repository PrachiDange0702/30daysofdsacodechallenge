class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }
    
    // Helper function to perform in-order traversal recursively.
    void inOrderTraversal(Node node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        
        // Traverse the left subtree
        inOrderTraversal(node.left, result);
        
        // Visit the current node (add it to the result)
        result.add(node.data);
        
        // Traverse the right subtree
        inOrderTraversal(node.right, result);
    }
}
