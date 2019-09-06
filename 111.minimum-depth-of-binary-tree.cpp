/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-06 23:16:27 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-06 23:25:33
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
    int minDepth(TreeNode *root)
    {
        if (!root)
            return 0;
        queue<TreeNode *> que;
        que.push(root);
        int height = 1;
        int ans = 1;
        int num = 0;
        while (!que.empty())
        {
            TreeNode *p = que.front();
            que.pop();
            ans--;
            if ((!p->left) && (!p->right))
                return height;
            if (p->left)
            {
                que.push(p->left);
                num++;
            }
            if (p->right)
            {
                que.push(p->right);
                num++;
            }
            if (ans == 0)
            {
                ans = num;
                num = 0;
                height++;
            }
        }
        return height;
    }
};
