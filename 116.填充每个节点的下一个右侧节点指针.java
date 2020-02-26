import java.util.LinkedList;
import java.util.Queue;

/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-26 14:29:33 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-26 14:53:25
 */
/*
 * @lc app=leetcode.cn id=116 lang=java
 *
 * [116] 填充每个节点的下一个右侧节点指针
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node != null) {
                node.next = queue.element();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            } else {
                if (queue.isEmpty()) {
                    break;
                }
                queue.offer(null);
            }
        }
        return root;
    }
}
// @lc code=end
