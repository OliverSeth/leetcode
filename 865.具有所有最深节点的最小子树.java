/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-13 14:51:45 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-12-13 14:59:58
 */
/*
 * @lc app=leetcode.cn id=865 lang=java
 *
 * [865] 具有所有最深节点的最小子树
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
    private int maxDepth;

    private TreeNode subtree;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        findMaxDepth(root, 0);
        findSubTree(root, 0);
        return subtree;
    }

    private void findMaxDepth(TreeNode root, int depth) {
        if (root == null) {
            maxDepth = Math.max(depth, maxDepth);
            return;
        }
        findMaxDepth(root.left, depth + 1);
        findMaxDepth(root.right, depth + 1);
    }

    private boolean findSubTree(TreeNode root, int depth) {
        if (root == null) {
            return depth == maxDepth;
        }
        boolean left = findSubTree(root.left, depth + 1);
        boolean right = findSubTree(root.right, depth + 1);
        if (left && right) {
            subtree = root;
            return true;
        } else if (left || right) {
            return true;
        } else {
            return false;
        }
    }
}
// @lc code=end

