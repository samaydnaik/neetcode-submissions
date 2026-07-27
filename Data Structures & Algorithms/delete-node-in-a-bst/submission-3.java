/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        /*
        if root is null, return null
        if node to be deleted is found, check for cases
        i) 0 child
        ii) 1 child
        iii) 2 children
         */

        if(root == null) return null;

        TreeNode curr = root;
        TreeNode parent = null;
        while(curr != null && curr.val != key){
            parent = curr;
            if(key > curr.val) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        if(curr == null) return root; // the key couldn't be found

        //At this point we found the Node to be deleted
        // 0 child
        if(curr.left == null && curr.right == null){
            if(parent == null) // only one node in entire tree which is to be deleted
            {
                return null;
            }
            if(parent.left == curr){
                parent.left = null;
            } else {
                parent.right = null;
            }
            return root;
        }

        //1 child
        if(curr.left == null || curr.right == null){
            TreeNode childSubTree = curr.left == null ? curr.right : curr.left;
            // when the root node is to be deleted, need to return the child which is present
            if(parent == null){
                return childSubTree;
            }
            if(parent.left == curr){
                parent.left = childSubTree;
            } else {
                parent.right = childSubTree;
            }

            return root;
        }

        /*
        In case of 2 children, inorder successor or inorder predecessor
        going with inorder successor means, right subtree of the node to be deleted, find the
         minimum value by going leftmost of the right subtree. This can replace the delete node
         if the leftmost node doesn't have any children
         parent of the leftmost is set to null
         parent of the deleteNode is set to leftmost node

         if the leftmost node has subtree (only right will be there)
         parent of the leftmost is set to this right subtree
         */
        if(curr.left != null && curr.right != null){
            TreeNode nodeToBeDeleted = curr;
            curr = curr.right;
            TreeNode parentLeftMost = null;
            while(curr.left != null){
                parentLeftMost = curr;
                curr = curr.left;
            }

            if(parentLeftMost == null) // means right of node to be deleted has only right subtree
            {
                if(parent == null){
                    curr.left = nodeToBeDeleted.left;
                    return curr;
                }

                if(parent.left == nodeToBeDeleted){
                    parent.left = curr;
                    curr.left = nodeToBeDeleted.left;
                } else {
                    parent.right = curr;
                    curr.left = nodeToBeDeleted.left;
                }
                return root;
            }

            if(curr.right == null){
                if(parent == null){
                    curr.left = nodeToBeDeleted.left;
                    curr.right = nodeToBeDeleted.right;
                                    parentLeftMost.left = null;

                    return curr;
                }
                if(parent.left == nodeToBeDeleted){
                    parent.left = curr;
                    curr.left = nodeToBeDeleted.left;
                    curr.right = nodeToBeDeleted.right;
                } else {
                    parent.right = curr;
                    curr.left = nodeToBeDeleted.left;
                    curr.right = nodeToBeDeleted.right;
                }
                parentLeftMost.left = null;
            } else {
                if(parent == null){
                                    parentLeftMost.left = curr.right;

                    curr.left = nodeToBeDeleted.left;
                    curr.right = nodeToBeDeleted.right;

                    return curr;
                }
                parentLeftMost.left = curr.right;

                if(parent.left == nodeToBeDeleted){
                    parent.left = curr;
                    curr.left = nodeToBeDeleted.left;
                    curr.right = nodeToBeDeleted.right;
                } else {
                    parent.right = curr;
                    curr.left = nodeToBeDeleted.left;
                    curr.right = nodeToBeDeleted.right;
                }
            }
        }
        return root;
    }
}