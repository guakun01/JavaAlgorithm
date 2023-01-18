package github.guakun01.linkedlist.middleofthelinkedlist;

import github.guakun01.linkedlist.ListNode;

// Refer: https://leetcode.cn/problems/middle-of-the-linked-list/
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast.next != null) {
            slow = slow.next;
        }


        return slow;
    }
}