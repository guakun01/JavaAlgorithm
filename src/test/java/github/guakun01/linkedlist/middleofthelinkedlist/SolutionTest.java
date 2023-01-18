package github.guakun01.linkedlist.middleofthelinkedlist;

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
      ListNode middleNode = solution.middleNode(list.getNode(0));
      Assertions.assertEquals(list.getNode(2), middleNode);
    }

    @Test
    public void test2() {
        LinkedList list = new LinkedList();
        list.add(0, 2);

      Solution solution = new Solution();
      ListNode middleNode = solution.middleNode(list.getNode(0));
      Assertions.assertEquals(list.getNode(0), middleNode);
    }

    @Test
    public void test3() {
        LinkedList list = new LinkedList();
        list.add(0, 2);
        list.add(1, 3);
        list.add(2, 1);
        list.add(3, 6);

      Solution solution = new Solution();
      ListNode middleNode = solution.middleNode(list.getNode(0));
      Assertions.assertEquals(list.getNode(2), middleNode);
    }
}
