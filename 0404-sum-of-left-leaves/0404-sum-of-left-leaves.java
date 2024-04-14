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
    public int sumOfLeftLeaves(TreeNode root)
    {
        return helper(root,false);
    }
    public int helper(TreeNode root, boolean fromLeft){
        // base condition
        if(root == null) return 0;

        if(root.left == null && root.right == null){
            if(fromLeft){
                return root.val;
            }
            return 0;
        }

        // function body
        return helper(root.left, true) + helper(root.right, false);
    }
}