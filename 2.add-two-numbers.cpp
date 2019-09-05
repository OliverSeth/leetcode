/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-05 11:02:12 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-05 11:25:19
 */
class Solution
{
public:
	ListNode *addTwoNumbers(ListNode *l1, ListNode *l2)
	{
		ListNode *p = l1;
		ListNode *q = l2;
		ListNode *m = new ListNode(0);
		ListNode *n = m;
		int ans = 0;
		while (p != NULL || q != NULL)
		{
			if (p == NULL)
			{
				int sum = q->val + ans;
				ans = sum / 10;
				n->next = new ListNode(sum % 10);
			}
			else if (q == NULL)
			{
				int sum = p->val + ans;
				ans = sum / 10;
				n->next = new ListNode(sum % 10);
			}
			else
			{
				int sum = p->val + q->val + ans;
				ans = sum / 10;
				n->next = new ListNode(sum % 10);
			}
			n = n->next;
			if (p != NULL)
				p = p->next;
			if (q != NULL)
				q = q->next;
		}
		if (ans != 0)
		{
			n->next = new ListNode(ans);
		}
		m = m->next;
		return m;
	}
};
