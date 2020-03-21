/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-21 22:27:05 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-21 22:27:05 
 */
/*
 * @lc app=leetcode.cn id=1372 lang=java
 *
 * [1372] 二叉树中的最长交错路径
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(zigZagLen(root.left, true, 0), zigZagLen(root.right, false, 0));
    }

    private int zigZagLen(TreeNode root, boolean isLeft, int len) {
        if (root == null) {
            return len;
        }
        if (isLeft) {
            return Math.max(zigZagLen(root.left, true, 0), zigZagLen(root.right, false, len + 1));
        } else {
            return Math.max(zigZagLen(root.left, true, len + 1), zigZagLen(root.right, false, 0));
        }
    }
}
// @lc code=end

