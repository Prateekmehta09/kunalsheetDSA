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
    public String smallestFromLeaf(TreeNode root) {
        
     List<List<Integer>> output = new ArrayList<List<Integer>>();
        List<Integer> adder = new ArrayList<Integer>();
        DFS(output,adder,root);
        String smallest = "";
        for (List<Integer> list : output) {
			StringBuilder sBuilder = new StringBuilder();
			for (int i = list.size()-1; i >= 0; i--) {
				sBuilder.append((char)(list.get(i)+97));
			}
			if(smallest.equals(""))smallest = sBuilder.toString();
			else if (smallest.compareTo(sBuilder.toString())>0)
				smallest = sBuilder.toString();
		}
        return smallest;
    }
    private void DFS(List<List<Integer>> output, List<Integer> adder, TreeNode root) {
    	if(root==null)
    	{
    		return;
    	}
    
			List<Integer> newAdder = new ArrayList<Integer>(adder);
			newAdder.add(root.val);
            if(root.left==null && root.right==null)
            {
                output.add(newAdder);
                return;
            }
			DFS(output,newAdder,root.left);
			DFS(output,newAdder,root.right);
		
	}
}