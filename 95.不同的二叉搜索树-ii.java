/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-15 14:56:59 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-15 15:25:55
 */
/*
 * @lc app=leetcode.cn id=95 lang=java
 *
 * [95] 不同的二叉搜索树 II
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
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> nodes = new ArrayList<>();
        if (n == 0) {
            return nodes;
        }
        nodes = buildTree(1, n + 1);
        return nodes;
    }

    public List<TreeNode> buildTree(int start, int end) {
        List<TreeNode> trees = new ArrayList<>();
        if (start >= end) {
            trees.add(null);
            return trees;
        }
        for (int i = start; i < end; i++) {
            List<TreeNode> left = buildTree(start, i);
            List<TreeNode> right = buildTree(i + 1, end);
            for (TreeNode leftNode : left) {
                for (TreeNode rightNode : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftNode;
                    root.right = rightNode;
                    trees.add(root);
                }
            }
        }
        return trees;
    }
}
// @lc code=end

