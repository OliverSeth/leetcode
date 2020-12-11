/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-10 13:46:54 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-10 13:46:54 
 */
/*
 * @lc app=leetcode.cn id=173 lang=java
 *
 * [173] 二叉搜索树迭代器
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
class BSTIterator {

    private TreeNode root;

    private TreeNode curr;

    public BSTIterator(TreeNode root) {
        this.root = root;
        this.curr = null;
    }

    public int next() {
        Stack<TreeNode> stack = new Stack<>();
        if (curr == null) {
            TreeNode p = root;
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            curr = stack.peek();
            return curr.val;
        } else {
            TreeNode p = root;
            while (p != curr) {
                stack.push(p);
                if (p.val > curr.val) {
                    p = p.left;
                } else {
                    p = p.right;
                }
            }
            p = p.right;
            if (p == null) {
                while (stack.peek().val <= curr.val) {
                    stack.pop();
                }
                curr = stack.peek();
            } else {
                while (p.left != null) {
                    p = p.left;
                }
                curr = p;
            }
            return curr.val;
        }
    }

    public boolean hasNext() {
        if (curr == null) {
            return root != null;
        }
        TreeNode p = root;
        while (p != null && p.val <= curr.val) {
            p = p.right;
        }
        return p != null;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end

