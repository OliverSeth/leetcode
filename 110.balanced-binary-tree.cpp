/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-10 20:17:49 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-10 21:52:58
 */
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution
{
public:
    bool isBalanced(TreeNode *root)
    {
        return helper(root);
    }
    int depth(TreeNode *root)
    {
        if (!root)
            return 0;
        return max(depth(root->left), depth(root->right)) + 1;
    }
    bool helper(TreeNode *root)
    {
        if (!root)
            return true;
        return (abs(depth(root->left) - depth(root->right)) <= 1) && helper(root->left) && helper(root->right);
    }
};
