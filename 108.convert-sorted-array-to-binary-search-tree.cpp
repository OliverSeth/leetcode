/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-10 16:58:30 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-10 17:05:24
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
    TreeNode *sortedArrayToBST(vector<int> &nums)
    {
        return helper(nums, 0, nums.size() - 1);
    }
    TreeNode *helper(vector<int> &nums, int begin, int end)
    {
        if (begin > end)
            return NULL;
        int root = (begin + end) / 2;
        TreeNode *p = new TreeNode(nums[root]);
        p->left = helper(nums, begin, root - 1);
        p->right = helper(nums, root + 1, end);
        return p;
    }
};
