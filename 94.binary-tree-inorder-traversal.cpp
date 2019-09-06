/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-06 15:14:23 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-06 15:19:43
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
    vector<int> inorderTraversal(TreeNode *root)
    {
        vector<int> result;
        inorder(root, result);
        return result;
    }
    void inorder(TreeNode *root, vector<int> &result)
    {
        if (root == NULL)
            return;
        inorder(root->left, result);
        result.push_back(root->val);
        inorder(root->right, result);
    }
};
