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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int currSum = 0;
        return calculateSum(root, currSum, targetSum);
    }

    public boolean calculateSum(TreeNode root,int currSum,int targetSum) {
        if (root == null)
            return false;

        currSum += root.val;

        if (root.left == null && root.right == null && targetSum != currSum) {
            currSum = currSum - root.val;
            return false;
        }

         if (root.left == null && root.right == null && targetSum == currSum) {
            return true;
        }

        if(calculateSum(root.left, currSum, targetSum)){
            return true;
        }

        if(calculateSum(root.right, currSum, targetSum)){
            return true;
        }

                    currSum = currSum - root.val;
        return false;
    }
}