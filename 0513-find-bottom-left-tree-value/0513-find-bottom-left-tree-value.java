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
     int maxi = 0;
    int ans = 0;
    public int findBottomLeftValue(TreeNode root) {
        godownontree(root, 0);
        return ans;
    }
    public void godownontree(TreeNode root, int level) {
        if(root == null) return;
        if(maxi == level) {
            ans = root.val;
            maxi++;
        }
        godownontree(root.left, level+1);
        godownontree(root.right, level+1);
    }
}