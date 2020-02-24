/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-24 17:43:12 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-24 19:27:17
 */
/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根到叶子节点数字之和
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private int sum;

    public int sumNumbers(TreeNode root) {
        calcul(root, 0);
        return sum;
    }

    private void calcul(TreeNode root, int num) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            sum += num * 10 + root.val;
            return;
        }
        if (root.left != null) {
            calcul(root.left, num * 10 + root.val);
        }
        if (root.right != null) {
            calcul(root.right, num * 10 + root.val);
        }
    }
}
// @lc code=end
