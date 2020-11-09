/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-09 08:05:19 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-09 08:05:19 
 */
/*
 * @lc app=leetcode.cn id=563 lang=java
 *
 * [563] 二叉树的坡度
 */

// @lc code=start
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
    private int sum = 0;

    public int findTilt(TreeNode root) {
        helper(root);
        return sum;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        sum += Math.abs(left - right);
        return left + right + root.val;
    }
}
// @lc code=end

