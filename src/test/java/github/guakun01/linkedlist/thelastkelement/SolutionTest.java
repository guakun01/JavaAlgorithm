package github.guakun01.linkedlist.thelastkelement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import github.guakun01.linkedlist.LinkedList;
import github.guakun01.linkedlist.ListNode;

public class SolutionTest {
    @Test
    public void test1() {
        LinkedList list = new LinkedList();
        list.add(0, 2);
        list.add(1, 3);
        list.add(2, 1);
        list.add(3, 6);
        list.add(4, 5);

      Solution solution = new Solution();
      ListNode kthFromEnd = solution.getKthFromEnd(list.getNode(0), 2);
      Assertions.assertEquals(list.getNode(3), kthFromEnd);
    }

}
