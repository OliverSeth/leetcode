/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-06 16:17:25 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-06 16:47:08
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
    bool isSymmetric(TreeNode *root)
    {
        queue<TreeNode *> que;
        que.push(root);
        que.push(root);
        while (!que.empty())
        {
            TreeNode *p1 = que.front();
            que.pop();
            if (que.empty())
                return false;
            TreeNode *p2 = que.front();
            que.pop();
            if (p1 == NULL && p2 == NULL)
                continue;
            if (p1 == NULL || p2 == NULL)
                return false;
            if (p1->val != p2->val)
                return false;
            que.push(p1->left);
            que.push(p2->right);
            que.push(p1->right);
            que.push(p2->left);
        }
        return true;
    }
};
