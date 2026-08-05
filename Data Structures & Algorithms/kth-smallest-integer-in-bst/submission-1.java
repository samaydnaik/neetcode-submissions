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
 /*
 DFS - Stacks Iterative

traverse full left then put that one 

 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
       List<Integer>result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        int count = 1;
        while(curr != null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            if(count == k) return curr.val;
            count++;
            curr = curr.right;
        }
        return -1;
    }
}
