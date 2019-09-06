/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-06 22:48:55 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-06 23:07:21
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
    vector<vector<int>> zigzagLevelOrder(TreeNode *root)
    {
        vector<vector<int>> result;
        if (!root)
            return result;
        bool zigzag = false;
        stack<int> sta;
        queue<TreeNode *> que;
        que.push(root);
        int ans = 1;
        int sum = 0;
        vector<int> memo;
        while (!que.empty())
        {
            if (!zigzag)
                memo.push_back(que.front()->val);
            else
                sta.push(que.front()->val);
            if (que.front()->left)
            {
                que.push(que.front()->left);
                sum++;
            }
            if (que.front()->right)
            {
                que.push(que.front()->right);
                sum++;
            }
            que.pop();
            ans--;
            if (ans == 0)
            {
                if (zigzag)
                {
                    while (!sta.empty())
                    {
                        memo.push_back(sta.top());
                        sta.pop();
                    }
                }
                zigzag = !zigzag;
                ans = sum;
                sum = 0;
                result.push_back(memo);
                memo.clear();
            }
        }
        return result;
    }
};
