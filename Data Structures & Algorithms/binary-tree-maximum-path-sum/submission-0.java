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
    int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return maxsum;
    }

    public int solve(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftgain = solve(root.left);
        int rightgain = solve(root.right);

        leftgain = Math.max(leftgain,0);
        rightgain = Math.max(rightgain,0);

        int pathNewSum = root.val + leftgain + rightgain;

        maxsum = Math.max(maxsum,pathNewSum);

        return root.val + Math.max(leftgain,rightgain);
    }
}
