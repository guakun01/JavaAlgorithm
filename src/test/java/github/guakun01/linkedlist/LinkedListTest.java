package github.guakun01.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    
    @Test
    public void testAdd() {
        LinkedList list = new LinkedList();
        list.add(0, 2);
        list.add(1, 3);
        list.add(2, 1);
        list.add(3, 6);
        list.add(4, 5);

        Assertions.assertEquals(2, list.getValue(0));
        Assertions.assertEquals(3, list.getValue(1));
        Assertions.assertEquals(1, list.getValue(2));
        Assertions.assertEquals(6, list.getValue(3));
        Assertions.assertEquals(5, list.getValue(4));

        Assertions.assertEquals(5, list.getLength());
        Assertions.assertEquals(5, list.getLengthByTraverse());
    }

    @Test
    public void testAddWithDummyNode() {
        LinkedList list = new LinkedList();
        list.addWithDummyNode(0, 2);
        list.addWithDummyNode(1, 3);
        list.addWithDummyNode(2, 1);
        list.addWithDummyNode(3, 6);
        list.addWithDummyNode(4, 5);

        Assertions.assertEquals(2, list.getValue(0));
        Assertions.assertEquals(3, list.getValue(1));
        Assertions.assertEquals(1, list.getValue(2));
        Assertions.assertEquals(6, list.getValue(3));
        Assertions.assertEquals(5, list.getValue(4));

        Assertions.assertEquals(5, list.getLength());
        Assertions.assertEquals(5, list.getLengthByTraverse());
    }

    @Test
    public void testAppend() {
        LinkedList list = new LinkedList();
        list.add(0, 2);
        list.add(1, 3);
        list.add(2, 1);
        list.add(3, 6);
        list.add(4, 5);

        Assertions.assertEquals(2, list.getValue(0));
        Assertions.assertEquals(3, list.getValue(1));
        Assertions.assertEquals(1, list.getValue(2));
        Assertions.assertEquals(6, list.getValue(3));
        Assertions.assertEquals(5, list.getValue(4));

        Assertions.assertEquals(5, list.getLength());
        Assertions.assertEquals(5, list.getLengthByTraverse());

        list.append(100);

        Assertions.assertEquals(2, list.getValue(0));
        Assertions.assertEquals(3, list.getValue(1));
        Assertions.assertEquals(1, list.getValue(2));
        Assertions.assertEquals(6, list.getValue(3));
        Assertions.assertEquals(5, list.getValue(4));
        Assertions.assertEquals(100, list.getValue(5));

        Assertions.assertEquals(6, list.getLength());
        Assertions.assertEquals(6, list.getLengthByTraverse());

    }

    @Test
    public void testSet() {
        LinkedList list = new LinkedList();
        list.add(0, 2);
        list.add(1, 3);
        list.add(2, 1);
        list.add(3, 6);
        list.add(4, 5);

        Assertions.assertEquals(2, list.getValue(0));
        Assertions.assertEquals(3, list.getValue(1));
        Assertions.assertEquals(1, list.getValue(2));
        Assertions.assertEquals(6, list.getValue(3));
        Assertions.assertEquals(5, list.getValue(4));

        Assertions.assertEquals(5, list.getLength());
        Assertions.assertEquals(5, list.getLengthByTraverse());

        list.set(4, 199);

        Assertions.assertEquals(2, list.getValue(0));
        Assertions.assertEquals(3, list.getValue(1));
        Assertions.assertEquals(1, list.getValue(2));
        Assertions.assertEquals(6, list.getValue(3));
        Assertions.assertEquals(199, list.getValue(4));

        Assertions.assertEquals(5, list.getLength());
        Assertions.assertEquals(5, list.getLengthByTraverse());

    }

    @Test
    public void testRemoveByIndex() {
        LinkedList list = new LinkedList();
        list.add(0, 2);
        list.add(1, 3);
        list.add(2, 1);
        list.add(3, 6);
        list.add(4, 5);

        Assertions.assertEquals(2, list.getValue(0));
        Assertions.assertEquals(3, list.getValue(1));
        Assertions.assertEquals(1, list.getValue(2));
        Assertions.assertEquals(6, list.getValue(3));
        Assertions.assertEquals(5, list.getValue(4));

        Assertions.assertEquals(5, list.getLength());
        Assertions.assertEquals(5, list.getLengthByTraverse());

        list.removeByIndex(4);
        list.removeByIndex(2);

        Assertions.assertEquals(2, list.getValue(0));
        Assertions.assertEquals(3, list.getValue(1));
        Assertions.assertEquals(6, list.getValue(2));
        Assertions.assertEquals(3, list.getLength());

        list.removeByIndex(0);

        Assertions.assertEquals(3, list.getValue(0));
        Assertions.assertEquals(6, list.getValue(1));

        Assertions.assertEquals(2, list.getLength());
        Assertions.assertEquals(2, list.getLengthByTraverse());

    }


    @Test
    public void testRemoveByIndexWithDummyNode() {
        LinkedList list = new LinkedList();
        list.addWithDummyNode(0, 2);
        list.addWithDummyNode(1, 3);
        list.addWithDummyNode(2, 1);
        list.addWithDummyNode(3, 6);
        list.addWithDummyNode(4, 5);

        Assertions.assertEquals(2, list.getValue(0));
        Assertions.assertEquals(3, list.getValue(1));
        Assertions.assertEquals(1, list.getValue(2));
        Assertions.assertEquals(6, list.getValue(3));
        Assertions.assertEquals(5, list.getValue(4));

        Assertions.assertEquals(5, list.getLength());
        Assertions.assertEquals(5, list.getLengthByTraverse());

        list.removeByIndexWithDummyNode(4);
        list.removeByIndexWithDummyNode(2);

        Assertions.assertEquals(2, list.getValue(0));
        Assertions.assertEquals(3, list.getValue(1));
        Assertions.assertEquals(6, list.getValue(2));
        Assertions.assertEquals(3, list.getLength());

        list.removeByIndexWithDummyNode(0);

        Assertions.assertEquals(3, list.getValue(0));
        Assertions.assertEquals(6, list.getValue(1));

        Assertions.assertEquals(2, list.getLength());
        Assertions.assertEquals(2, list.getLengthByTraverse());

    }
}
