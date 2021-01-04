/*
 * @Author: Oliver Seth 
 * @Date: 2021-01-03 12:55:04 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2021-01-03 12:55:04 
 */
/*
 * @lc app=leetcode.cn id=1379 lang=java
 *
 * [1379] 找出克隆二叉树中的相同节点
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
    private TreeNode res = null;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        helper(original, cloned, target);
        return res;
    }

    private void helper(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (res != null) {
            return;
        }
        if (original == null) {
            return;
        }
        if (original == target) {
            res = cloned;
        }
        helper(original.left, cloned.left, target);
        helper(original.right, cloned.right, target);
    }
}
// @lc code=end

