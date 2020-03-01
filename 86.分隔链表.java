/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-01 18:03:29 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-01 18:10:55
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallIt = small;
        ListNode big = new ListNode(0);
        ListNode bigIt = big;
        while (head != null) {
            if (head.val < x) {
                smallIt.next = head;
                smallIt = smallIt.next;
            } else {
                bigIt.next = head;
                bigIt = bigIt.next;
            }
            head = head.next;
        }
        bigIt.next = null;
        smallIt.next = big.next;
        return small.next;
    }
}