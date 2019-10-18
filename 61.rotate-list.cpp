/*
 * @Author: Oliver Seth 
 * @Date: 2019-10-18 15:58:24 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-10-18 16:13:04
 */
// @lc code=start
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
    ListNode *rotateRight(ListNode *head, int k)
    {
        if (k == 0 || head == NULL || head->next == NULL)
            return head;
        int cnt = 0;
        ListNode *p = head;
        while (p)
        {
            cnt++;
            p = p->next;
        }
        k = k % cnt;
        if (k == 0)
            return head;
        p = head;
        for (int i = 0; i < cnt - k - 1; i++)
            p = p->next;
        ListNode *q = p;
        p = p->next;
        q->next = NULL;
        q = p;
        while (p->next != NULL)
            p = p->next;
        p->next = head;
        return q;
    }
};
// @lc code=end
