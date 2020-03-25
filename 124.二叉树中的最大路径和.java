/*
 * @lc app=leetcode.cn id=124 lang=java
 *
 * [124] 二叉树中的最大路径和
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private int maxLen;

    public int maxPathSum(TreeNode root) {
        maxLen = root.val;
        helper(root);
        return maxLen;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);
        maxLen = Math.max(maxLen, left + root.val + right);
        return Math.max(left, right) + root.val;
    }
}
// @lc code=end
