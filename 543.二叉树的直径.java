/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-10 15:02:49 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-10 15:21:59
 */
/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private int maxLen = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return maxLen;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return -1;
        } else {
            int left = helper(root.left) + 1;
            int right = helper(root.right) + 1;
            maxLen = Math.max(maxLen, left + right);
            return Math.max(left, right);
        }
    }
}
// @lc code=end
