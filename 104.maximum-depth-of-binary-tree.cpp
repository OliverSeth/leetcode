/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-09 15:47:49 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-09 16:01:23
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
    int max_num = 0;
    int maxDepth(TreeNode *root)
    {
        helper(root, 0);
        return max_num;
    }
    void helper(TreeNode *root, int depth)
    {
        if (!root)
        {
            max_num = max(max_num, depth);
            return;
        }
        helper(root->left, depth + 1);
        helper(root->right, depth + 1);
    }
};
