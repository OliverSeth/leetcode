/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-10 13:16:59 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-10 13:16:59 
 */
/*
 * @lc app=leetcode.cn id=1026 lang=java
 *
 * [1026] 节点与其祖先之间的最大差值
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
    int maxDif = 0;

    public int maxAncestorDiff(TreeNode root) {
        helper(root, root.val, root.val);
        return maxDif;
    }

    private void helper(TreeNode root, int maxNum, int minNum) {
        if (root == null) {
            return;
        }
        maxDif = Math.max(Math.max(Math.abs(maxNum - root.val), Math.abs(minNum - root.val)), maxDif);
        helper(root.left, Math.max(maxNum, root.val), Math.min(minNum, root.val));
        helper(root.right, Math.max(maxNum, root.val), Math.min(minNum, root.val));
    }
}
// @lc code=end

