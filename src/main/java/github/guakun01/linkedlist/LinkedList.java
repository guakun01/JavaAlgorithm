package github.guakun01.linkedlist;

import java.util.Objects;

public class LinkedList {
    // Field
    ListNode head;
    int length;

    // Constructor
    public LinkedList() {
    }

    public LinkedList(ListNode head) {
        this.head = head;
    }

    // Method
    public int getValue(int index) {
        ListNode node = getNode(index);
        if (Objects.isNull(node)) {
            throw new RuntimeException(String.format("The node for index %s is empty", index));
        }
        return node.val;
    }

    public ListNode getNode(int index) {
        preCheckIndex(index, length - 1);
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public void add(int index, int value) {
        preCheckIndex(index, length);

        length += 1;
        if (index == 0) {
            head = new ListNode(value, head);
            return;
        }

        // Search
        ListNode pre = getNode(index - 1);
        ListNode cur = pre.next;

        // Build new node
        ListNode insertNode = new ListNode(value, cur);

        // Change linked list structure
        pre.next = insertNode;
    }

    public void addWithDummyNode(int index, int value) {
        preCheckIndex(index, length);

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        // Search
        ListNode pre = dummyNode;
        while (index > 0) {
            pre = pre.next;
            index--;
        }
        ListNode cur = pre.next;

        // Build new node
        length += 1;
        ListNode insertNode = new ListNode(value, cur);

        // Change linked list structure
        pre.next = insertNode;
        head = dummyNode.next;
    }

    private void preCheckIndex(int index, int restrition) {
        if (index < 0 || index > restrition) {
            throw new RuntimeException(
                    String.format("The index is out of range, restrition is %s.", restrition));
        }
    }

    public void append(int value) {
        add(length, value);
    }

    public void set(int index, int value) {
        // search
        getNode(index).val = value;
    }

    public void removeByIndex(int index) {
        preCheckIndex(index, length - 1);

        length -= 1;
        if (index == 0) {
            ListNode cur = head;
            cur = null;
            head = head.next;
            return;
        }

        // Search
        ListNode pre = getNode(index - 1);
        ListNode cur = pre.next;
        ListNode nextNode = cur.next;

        // Change structure
        pre.next = nextNode;
    }

    public void removeByIndexWithDummyNode(int index) {
        preCheckIndex(index, length - 1);
        length -= 1;
       
        // Build dummyNode
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode pre = dummyNode;
        while(index > 0) {
            pre = pre.next;
            index--;
        }

        // Search
        ListNode cur = pre.next;
        ListNode nextNode = cur.next;

        // Change structure
        pre.next = nextNode;
        head = dummyNode.next;
    }

    public void removeByValue(int value) {
        // Homework
    }

    public int getLength() {
        return length;
    }

    public int getLengthByTraverse() {
        int len = 0;
        ListNode cur = head;
        while (Objects.nonNull(cur)) {
            cur = cur.next;
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(0, 2);
        list.add(1, 3);
        list.add(2, 1);
        list.add(3, 6);
        list.add(4, 5);

        // System.out.println(list.getValue(0));
        // System.out.println(list.getValue(1));
        // System.out.println(list.getValue(2));
        // System.out.println(list.getValue(3));
        // System.out.println(list.getValue(4));

        list.add(3, 7);

        // System.out.println(list.getValue(0));
        // System.out.println(list.getValue(1));
        // System.out.println(list.getValue(2));
        // System.out.println(list.getValue(3));
        // System.out.println(list.getValue(4));
        // System.out.println(list.getValue(5));

        list.append(100);
        list.set(6, 199);

        System.out.println(list.getValue(0));
        System.out.println(list.getValue(1));
        System.out.println(list.getValue(2));
        System.out.println(list.getValue(3));
        System.out.println(list.getValue(4));
        System.out.println(list.getValue(5));
        System.out.println(list.getValue(6));

        System.out.println("=================");
        list.removeByIndex(6);
        list.removeByIndex(3);
        System.out.println(list.getValue(0));
        System.out.println(list.getValue(1));
        System.out.println(list.getValue(2));
        System.out.println(list.getValue(3));
        System.out.println(list.getValue(4));
    }
}
