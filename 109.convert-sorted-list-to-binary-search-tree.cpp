/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-10 20:01:56 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-10 21:44:27
 */
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
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
    TreeNode *sortedListToBST(ListNode *head)
    {
        int len = 0;
        ListNode *p = head;
        while (p)
        {
            p = p->next;
            len++;
        }
        return helper(head, 0, len - 1);
    }
    TreeNode *helper(ListNode *head, int begin, int end)
    {
        if (begin > end)
            return NULL;
        int mid = (begin + end) / 2;
        int r = mid;
        ListNode *p = head;
        while (r != 0)
        {
            r--;
            p = p->next;
        }
        TreeNode *root = new TreeNode(p->val);
        root->left = helper(head, begin, mid - 1);
        root->right = helper(head, mid + 1, end);
        return root;
    }
};
