/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-09 14:00:30 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-09 14:18:59
 */
/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个排序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        int ans = 1;
        while (ans < lists.length) {
            for (int i = 0; i < lists.length - ans; i += ans * 2) {
                lists[i] = mergeTwoLists(lists[i], lists[i + ans]);
            }
            ans *= 2;
        }
        return lists[0];
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) {
            p.next = l1;
        }
        if (l2 != null) {
            p.next = l2;
        }
        return head.next;
    }
}
// @lc code=end
