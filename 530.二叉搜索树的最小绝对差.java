/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-12 11:58:08 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-12 11:58:08 
 */
/*
 * @lc app=leetcode.cn id=530 lang=java
 *
 * [530] 二叉搜索树的最小绝对差
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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        treeToArray(root, list);
        int num = list.get(1) - list.get(0);
        for (int i = 2; i < list.size(); i++) {
            num = Math.min(num, list.get(i) - list.get(i - 1));
            if (num == 0) {
                return 0;
            }
        }
        return num;
    }

    private void treeToArray(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        treeToArray(root.left, list);
        list.add(root.val);
        treeToArray(root.right, list);
    }
}
// @lc code=end

