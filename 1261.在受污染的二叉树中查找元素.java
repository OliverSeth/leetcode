/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-25 14:29:39 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-25 14:29:39 
 */
/*
 * @lc app=leetcode.cn id=1261 lang=java
 *
 * [1261] 在受污染的二叉树中查找元素
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class FindElements {
    private TreeNode root;

    public FindElements(TreeNode root) {
        this.root = root;
        helper(root, 0);
    }

    private void helper(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        root.val = val;
        helper(root.left, 2 * val + 1);
        helper(root.right, 2 * val + 2);
    }

    public boolean find(int target) {
        return findHelper(root, target);
    }

    private boolean findHelper(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if (root.val == target) {
            return true;
        }
        if (root.val * 2 >= target) {
            return false;
        }
        return findHelper(root.left, target) || findHelper(root.right, target);
    }
}
/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root); boolean param_1 =
 * obj.find(target);
 */
// @lc code=end
