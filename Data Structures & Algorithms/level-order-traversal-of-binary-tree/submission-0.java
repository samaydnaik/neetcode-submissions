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
bfs = queue usage
add 1, then add 2 and 3, remove 1 
add 4, 5 , remove 2, add 6, 7 remove 3
[1], [1,2,3], [2,3] , [2,3,4,5], [3,4,5,6,7] , [4,5,6,7]
[root], [root, left, right], [left, right], [root,]
*/
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>>result = new ArrayList<>();
        if(root == null) return new ArrayList<>();
        queue.add(root);

        result.add(List.of(root.val));
        int level = 0;
        while(!queue.isEmpty()){
            int levelLength  = queue.size();
            List<Integer>eachLevelValues = new ArrayList<>();
            for(int i = 0;i<levelLength;i++){
                TreeNode curr = queue.poll();
                if(curr.left!=null){
                queue.add(curr.left);
                eachLevelValues.add(curr.left.val);
                }
                if(curr.right!=null){
                queue.add(curr.right);
                eachLevelValues.add(curr.right.val);
                }
            }
            if(!eachLevelValues.isEmpty())
            result.add(eachLevelValues);
            level++;
        }

        return result;
    }
}
