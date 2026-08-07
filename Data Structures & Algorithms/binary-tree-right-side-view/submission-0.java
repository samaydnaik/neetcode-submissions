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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> traverse = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return new ArrayList<>();
        }
        traverse.add(root);
        result.add(root.val);
        int levels = 0;
        while(!traverse.isEmpty()){
            List<Integer> levelValues = new ArrayList<>();
            int levelLength = traverse.size();
            for(int i = 0;i<levelLength;i++){
                TreeNode curr = traverse.poll();
                if(curr.left!=null){
                traverse.add(curr.left);
                System.out.println(curr.left.val);
                levelValues.add(curr.left.val);
                }
                if(curr.right!=null){
                traverse.add(curr.right);
                System.out.println(curr.right.val);
                levelValues.add(curr.right.val);
                }
            }
            levels++;
            if(levelValues.size()>0)
            result.add(levelValues.get(levelValues.size()-1));
        }

        return result;
    }
}
