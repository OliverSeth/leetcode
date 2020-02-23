/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-23 16:00:38 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-23 18:02:23
 */
/*
 * @lc app=leetcode.cn id=114 lang=java
 *
 * [114] 二叉树展开为链表
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public void flatten(TreeNode root) {
        root = treeToList(root);
    }

    private TreeNode treeToList(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        TreeNode left = root;
        if (root.left != null) {
            left = treeToList(root.left);
            left.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        if (root.right != null) {
            return treeToList(root.right);
        }
        return left;
    }
}
// @lc code=end
