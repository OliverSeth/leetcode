/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-15 11:52:12 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-15 11:52:12 
 */
/*
 * @lc app=leetcode.cn id=1305 lang=java
 *
 * [1305] 两棵二叉搜索树中的所有元素
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> element1 = new ArrayList<>();
        List<Integer> element2 = new ArrayList<>();
        helper(root1, element1);
        helper(root2, element2);
        List<Integer> res = new ArrayList<>();
        for (int i = 0, j = 0; i < element1.size() || j < element2.size();) {
            if (i == element1.size()) {
                res.add(element2.get(j++));
            } else if (j == element2.size()) {
                res.add(element1.get(i++));
            } else {
                if (element1.get(i) < element2.get(j)) {
                    res.add(element1.get(i++));
                } else {
                    res.add(element2.get(j++));
                }
            }
        }
        return res;
    }

    private void helper(TreeNode root, List<Integer> element) {
        if (root == null) {
            return;
        }
        helper(root.left, element);
        element.add(root.val);
        helper(root.right, element);
    }
}
// @lc code=end
