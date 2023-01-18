package github.guakun01.linkedlist.middleofthelinkedlist;

import github.guakun01.linkedlist.ListNode;

// Refer: https://leetcode.cn/problems/middle-of-the-linked-list/
class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        ListNode pointer = head;

        int curTimes = 0;
        while (head.getNext() != null) {
            head = head.getNext();
            curTimes++;
            if (curTimes % 2 == 1) {
                pointer = pointer.getNext();
            }
        }

        return pointer;
    }
}