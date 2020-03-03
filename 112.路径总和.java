/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-03 15:26:29 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-03 15:36:10
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        } else {
            return helper(root, sum, 0);
        }
    }

    private boolean helper(TreeNode root, int sum, int one) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (one + root.val == sum) {
                return true;
            } else {
                return false;
            }
        }
        return helper(root.left, sum, one + root.val) || helper(root.right, sum, one + root.val);
    }
}