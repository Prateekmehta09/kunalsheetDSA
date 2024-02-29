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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            int prevVal = level % 2 == 0 ? Integer.MIN_VALUE: Integer.MAX_VALUE;
            for (int currentSize = 0; currentSize < queueSize; currentSize++) {
                TreeNode current = queue.poll();
                if (level % 2 == 0) {
                    if (current.val % 2 != 1 || prevVal >= current.val) return false;
                } else {
                    if (current.val % 2 != 0 || prevVal <= current.val) return false;
                }
                prevVal = current.val;
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            level++;
        }

        return true;
    }
}