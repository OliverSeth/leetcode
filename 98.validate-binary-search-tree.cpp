/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-09 10:19:59 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-09 13:15:38
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
    bool isValidBST(TreeNode *root)
    {
        vector<int> vec;
        inOrder(root, vec);
        if (vec.size() < 2)
        {
            return true;
        }
        for (int i = 0; i < vec.size() - 1; i++)
        {
            if (vec[i] >= vec[i + 1])
                return false;
        }
        return true;
    }
    void inOrder(TreeNode *root, vector<int> &vec)
    {
        if (!root)
            return;
        inOrder(root->left, vec);
        vec.push_back(root->val);
        inOrder(root->right, vec);
    }
};
