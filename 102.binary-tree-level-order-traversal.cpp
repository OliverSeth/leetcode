/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-06 16:54:48 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-06 17:16:49
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
    vector<vector<int>> levelOrder(TreeNode *root)
    {
        vector<vector<int>> result;
        if (!root)
            return result;
        queue<TreeNode *> que;
        que.push(root);
        int ans = 1;
        int num = 0;
        vector<int> memo;
        while (!que.empty())
        {
            TreeNode *p = que.front();
            que.pop();
            ans--;
            memo.push_back(p->val);
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
                result.push_back(memo);
                memo.clear();
                ans = num;
                num = 0;
            }
        }
        return result;
    }
};
