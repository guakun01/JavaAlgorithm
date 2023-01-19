package github.guakun01.linkedlist.linkedlistcircleii;

import github.guakun01.linkedlist.ListNode;

// refer: https://leetcode.cn/problems/linked-list-cycle-ii/
public class Solution {
    // 数学题，直接背模板
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode sentry = head;
                while (sentry != slow) {
                    sentry = sentry.next;
                    slow = slow.next;
                }
                return sentry;
            }
        }

        return null;
    }
}
