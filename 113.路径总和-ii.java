import java.util.ArrayList;
import java.util.List;

/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-23 15:31:51 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-23 15:57:15
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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        calculateSum(res, new ArrayList<>(), root, 0, sum);
        return res;
    }

    private void calculateSum(List<List<Integer>> res, List<Integer> path, TreeNode root, int num, int sum) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        num += root.val;
        if (root.left == null && root.right == null) {
            if (num == sum) {
                res.add(new ArrayList<>(path));
            }
            path.remove(path.size() - 1);
            return;
        }
        if (root.left != null) {
            calculateSum(res, path, root.left, num, sum);
        }
        if (root.right != null) {
            calculateSum(res, path, root.right, num, sum);
        }
        num -= root.val;
        path.remove(path.size() - 1);
    }
}