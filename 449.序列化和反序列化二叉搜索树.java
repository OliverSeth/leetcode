/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-10 13:46:19 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-10 13:46:19 
 */
/*
 * @lc app=leetcode.cn id=449 lang=java
 *
 * [449] 序列化和反序列化二叉搜索树
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
public class Codec {
    int pos;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serHelper(root, sb);
        return sb.toString();
    }

    private void serHelper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("n.");
            return;
        }
        sb.append(root.val);
        sb.append('.');
        serHelper(root.left, sb);
        serHelper(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split("\\.");
        return desHelper(arr);
    }

    private TreeNode desHelper(String[] arr) {
        if (pos >= arr.length || arr[pos].equals("n")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[pos]));
        pos += 1;
        root.left = desHelper(arr);
        pos += 1;
        root.right = desHelper(arr);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
// @lc code=end

