/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-16 20:15:48 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-16 20:22:18
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        boolean firstA = true;
        boolean firstB = true;
        while (p != null && q != null) {
            if (p == q) {
                return p;
            }
            p = p.next;
            q = q.next;
            if (p == null && firstA) {
                firstA = false;
                p = headB;
            }
            if (q == null && firstB) {
                firstB = false;
                q = headA;
            }
        }
        return null;
    }
}