/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-20 10:09:01 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-20 10:09:01 
 */
/*
 * @lc app=leetcode.cn id=143 lang=java
 *
 * [143] 重排链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        List<ListNode> listNodes = new ArrayList<>();
        while (head != null) {
            listNodes.add(head);
            head = head.next;
        }
        int left = 0;
        int right = listNodes.size() - 1;
        ListNode tmp = new ListNode(0);
        while (left <= right) {
            tmp.next = listNodes.get(left);
            if (left != right) {
                listNodes.get(left).next = listNodes.get(right);
            }
            tmp = listNodes.get(right);
            left++;
            right--;
        }
        tmp.next = null;
        head = listNodes.get(0);
    }
}
// @lc code=end

