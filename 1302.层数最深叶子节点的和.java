/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-16 11:52:51 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-16 11:52:51 
 */
/*
 * @lc app=leetcode.cn id=1302 lang=java
 *
 * [1302] 层数最深叶子节点的和
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int sum = 0;
        queue.offer(root);
        queue.offer(null);
        while (!queue.isEmpty()) {
            if (queue.peek() == null) {
                queue.poll();
                if (queue.isEmpty()) {
                    return sum;
                } else {
                    queue.offer(null);
                    sum = 0;
                }
            }
            TreeNode node = queue.poll();
            sum += node.val;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return sum;
    }
}
// @lc code=end
