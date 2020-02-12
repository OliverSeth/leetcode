/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-12 14:51:53 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-12 15:07:41
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head;
        ListNode m = head;
        ListNode q = p.next;
        p.next = q.next;
        q.next = p;
        head = q;
        m = p;
        if (p.next == null) {
            return head;
        }
        p = p.next;
        q = p.next;
        while (q != null) {
            p.next = q.next;
            q.next = p;
            m.next = q;
            m = p;
            if (p.next == null) {
                break;
            }
            p = p.next;
            q = p.next;
        }
        return head;
    }
}
