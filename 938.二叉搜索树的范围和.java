/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-16 13:26:27 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-11-16 13:29:09
 */
/*
 * @lc app=leetcode.cn id=938 lang=java
 *
 * [938] 二叉搜索树的范围和
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int tmp = 0;
        if (root.val >= low && root.val <= high) {
            tmp = root.val;
        }
        return tmp + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
// @lc code=end

