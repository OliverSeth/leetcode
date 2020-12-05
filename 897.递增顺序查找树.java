/*
 * @lc app=leetcode.cn id=897 lang=java
 *
 * [897] 递增顺序查找树
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
    private TreeNode node;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode newRoot = new TreeNode();
        node = newRoot;
        helper(root);
        return newRoot.right;
    }

    private void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        root.left = null;
        node.right = root;
        node = node.right;
        helper(root.right);
    }
}
// @lc code=end

