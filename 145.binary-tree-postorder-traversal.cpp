/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-29 14:00:46 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-29 14:04:23
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
    void helper(vector<int> &treeNode, TreeNode *root)
    {
        if (!root)
            return;
        helper(treeNode, root->left);
        helper(treeNode, root->right);
        treeNode.push_back(root->val);
    }
    vector<int> postorderTraversal(TreeNode *root)
    {
        vector<int> treeNode;
        helper(treeNode, root);
        return treeNode;
    }
};
