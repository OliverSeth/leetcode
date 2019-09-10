/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-10 13:22:00 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-10 16:38:15
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
    TreeNode *buildTree(vector<int> &preorder, vector<int> &inorder)
    {
        return treeStructure(preorder, inorder, 0, 0, preorder.size() - 1);
    }
    TreeNode *treeStructure(vector<int> preorder, vector<int> &inorder, int root, int start, int end)
    {
        if (start > end)
            return NULL;
        int i = start;
        for (; i < end; i++)
        {
            if (inorder[i] == preorder[root])
                break;
        }
        TreeNode *p = new TreeNode(preorder[root]);
        p->left = treeStructure(preorder, inorder, root + 1, start, i - 1);
        p->right = treeStructure(preorder, inorder, root + i - start + 1, i + 1, end);
        return p;
    }
};
