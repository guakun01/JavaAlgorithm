package github.guakun01.linkedlist.thelastkelement;

import github.guakun01.linkedlist.ListNode;

// Refer: https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode quick = head;
        ListNode slow = head;

        while (k > 1 && quick != null) {
            quick = quick.next;
            k--;
        }
        while (quick.next != null) {
            quick = quick.next;
            slow = slow.next;
        }
        return slow;
    }
}
