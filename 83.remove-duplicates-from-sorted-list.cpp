/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-15 11:54:44 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-15 14:00:48
 */
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution
{
public:
    ListNode *deleteDuplicates(ListNode *head)
    {
        ListNode *p = head;
        if (p == NULL)
            return head;
        ListNode *q = p->next;
        while (q != NULL)
        {
            if (p->val == q->val)
            {
                p->next = q->next;
                q = p->next;
            }
            else
            {
                p = p->next;
                q = q->next;
            }
        }
        return head;
    }
};
