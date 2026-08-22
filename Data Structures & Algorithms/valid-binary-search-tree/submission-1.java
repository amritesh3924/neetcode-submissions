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
    public boolean isValidBST(TreeNode root) {
        //maintain a range for every node [min,max];
        return isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private boolean isValidBST(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }
        if(root.val < min || root.val > max){
            return false;
        }
        return isValidBST(root.left,min,(long)root.val-1) && 
            isValidBST(root.right,(long)root.val+1,max);
    }
}
