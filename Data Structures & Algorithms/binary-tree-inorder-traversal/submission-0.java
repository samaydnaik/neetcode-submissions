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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer =new ArrayList<>();

        traverse(root, answer);
        return answer;
    }

    TreeNode traverse(TreeNode root, List<Integer>answer){
        if(root == null)return null;

        root.left = traverse(root.left, answer);
        answer.add(root.val);
        root.right = traverse(root.right, answer);

        return root;
    }
}