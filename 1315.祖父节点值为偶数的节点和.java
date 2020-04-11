/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-11 17:21:45 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-11 17:21:45 
 */
/*
 * @lc app=leetcode.cn id=1315 lang=java
 *
 * [1315] 祖父节点值为偶数的节点和
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private int sum = 0;

    public int sumEvenGrandparent(TreeNode root) {
        helper(root, false, false);
        return sum;
    }

    public void helper(TreeNode root, boolean grand, boolean parent) {
        if (root == null) {
            return;
        }
        if (grand) {
            sum += root.val;
        }
        grand = parent;
        parent = root.val % 2 == 0;
        helper(root.left, grand, parent);
        helper(root.right, grand, parent);
    }
}
// @lc code=end
