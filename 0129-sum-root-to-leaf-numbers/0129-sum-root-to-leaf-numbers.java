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
    public int sumNumbers(TreeNode root) {
        return dfs(root,0,0);
    }
     private int dfs(TreeNode node, int sum, int cur){
        if(node == null)return sum;
        cur = cur * 10 + node.val;
        if(node.left == null && node.right == null){
            // System.out.println(node.val + " " + left);
            sum += cur;
            return sum;
        }
        if(node.left != null)sum = dfs(node.left, sum, cur);
        if(node.right != null)sum = dfs(node.right, sum , cur);
        return sum;
     }
}