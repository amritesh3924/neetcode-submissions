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
    public int goodNodes(TreeNode root) {
        //make a helper function which will count the no. of good nodes
        return countGoodNodes(root,Integer.MIN_VALUE);
    }
    public int countGoodNodes(TreeNode node, int maxSofar){
        if(node == null){
            return 0;
        }
        int count = 0;
        if(node.val >= maxSofar){
            count = 1;
            maxSofar = node.val;
        }
        count += countGoodNodes(node.left,maxSofar);
        count += countGoodNodes(node.right,maxSofar);
        return count;
    }
}
