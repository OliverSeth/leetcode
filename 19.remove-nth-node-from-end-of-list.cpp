/*
 * @Author: Oliver Seth 
 * @Date: 2019-10-21 11:01:35 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-10-21 11:12:03
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
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int cnt=0;
        ListNode* p=head;
        while(p)
        {
            cnt++;
            p=p->next;
        }
        n=cnt-n;
        if(n==0)
            return head->next;
        p=head;
        while(n>1)
        {
            n--;
            p=p->next;
        }
        ListNode* q=p->next;
        p->next=q->next;
        return head;
    }
};
// @lc code=end

