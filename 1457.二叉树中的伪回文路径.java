/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-30 10:14:58 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-30 10:14:58 
 */
/*
 * @lc app=leetcode.cn id=1457 lang=java
 *
 * [1457] 二叉树中的伪回文路径
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
    private int cnt;

    public int pseudoPalindromicPaths(TreeNode root) {
        int[] arr = new int[10];
        helper(root, arr);
        return cnt;
    }

    private void helper(TreeNode root, int[] arr) {
        if (root == null) {
            return;
        }
        arr[root.val]++;
        if (root.left == null && root.right == null) {
            int even = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 1) {
                    even++;
                }
            }
            if (even <= 1) {
                cnt++;
            }
            arr[root.val]--;
            return;
        }
        helper(root.left, arr);
        helper(root.right, arr);
        arr[root.val]--;
    }
}
// @lc code=end

