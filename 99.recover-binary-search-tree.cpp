/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-09 14:13:07 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-09 14:37:55
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
    TreeNode *left = NULL, *right = NULL;
    bool left_change = true, right_change = true;
    void recoverTree(TreeNode *root)
    {
        inOrder(root);
        revInOrder(root);
        swap(left->val, right->val);
        return;
    }
    void inOrder(TreeNode *root)
    {
        if (!root)
            return;
        inOrder(root->left);
        if (!left)
            left = root;
        else
        {
            if ((left_change) && ((root->val) > (left->val)))
                left = root;
            else
                left_change = false;
        }
        inOrder(root->right);
    }
    void revInOrder(TreeNode *root)
    {
        if (!root)
            return;
        revInOrder(root->right);
        if (!right)
            right = root;
        else
        {
            if ((right_change) && ((root->val) < (right->val)))
                right = root;
            else
                right_change = false;
        }
        revInOrder(root->left);
    }
};
