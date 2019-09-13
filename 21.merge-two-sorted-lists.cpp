/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-13 22:20:08 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-13 22:20:55
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
    ListNode *mergeTwoLists(ListNode *l1, ListNode *l2)
    {
        ListNode *p = new ListNode(0);
        ListNode *q = p;
        ListNode *p1 = l1;
        ListNode *p2 = l2;
        while (p1 || p2)
        {
            if (!p1)
            {
                p->next = new ListNode(p2->val);
                p2 = p2->next;
                p = p->next;
                continue;
            }
            if (!p2)
            {
                p->next = new ListNode(p1->val);
                p1 = p1->next;
                p = p->next;
                continue;
            }
            if (p1->val <= p2->val)
            {
                p->next = new ListNode(p1->val);
                p1 = p1->next;
                p = p->next;
            }
            else
            {
                p->next = new ListNode(p2->val);
                p2 = p2->next;
                p = p->next;
            }
        }
        return q->next;
    }
};
