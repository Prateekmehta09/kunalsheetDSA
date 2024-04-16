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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
         return solve(root, val, depth, true);  
    }
    
    public TreeNode solve(TreeNode root, int val, int depth, boolean isLeft) {
        
        if(depth == 1) {
            if(isLeft) {
               
                return new TreeNode(val, root, null);
            } else {

                return new TreeNode(val, null, root);
            }
        }

        if(root == null) {
            return null;
        }

        root.left = solve(root.left, val, depth-1, true);
        root.right = solve(root.right, val, depth-1, false);
        return root;
    }
}