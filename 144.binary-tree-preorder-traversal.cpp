/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-29 13:54:16 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-29 13:59:58
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
        treeNode.push_back(root->val);
        helper(treeNode, root->left);
        helper(treeNode, root->right);
    }
    vector<int> preorderTraversal(TreeNode *root)
    {
        vector<int> treeNode;
        helper(treeNode, root);
        return treeNode;
    }
};
