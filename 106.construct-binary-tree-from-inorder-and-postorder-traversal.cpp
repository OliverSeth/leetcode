/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-10 16:40:29 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-10 16:53:45
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
    TreeNode *buildTree(vector<int> &inorder, vector<int> &postorder)
    {
        return treeStrcture(inorder, postorder, postorder.size() - 1, 0, inorder.size() - 1);
    }
    TreeNode *treeStrcture(vector<int> &inorder, vector<int> &postorder, int root, int start, int end)
    {
        if (start > end)
            return NULL;
        int i = start;
        while (inorder[i] != postorder[root])
            i++;
        TreeNode *p = new TreeNode(postorder[root]);
        p->left = treeStrcture(inorder, postorder, root - 1 - end + i, start, i - 1);
        p->right = treeStrcture(inorder, postorder, root - 1, i + 1, end);
        return p;
    }
};
