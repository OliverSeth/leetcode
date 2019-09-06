/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-06 17:20:29 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-06 17:21:29
 */
/*
 * @lc app=leetcode id=107 lang=cpp
 *
 * [107] Binary Tree Level Order Traversal II
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
    vector<vector<int>> levelOrderBottom(TreeNode *root)
    {
        vector<vector<int>> result;
        if (!root)
            return result;
        stack<vector<int>> sta;
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
                sta.push(memo);
                memo.clear();
                ans = num;
                num = 0;
            }
        }
        while (!sta.empty())
        {
            result.push_back(sta.top());
            sta.pop();
        }
        return result;
    }
};
