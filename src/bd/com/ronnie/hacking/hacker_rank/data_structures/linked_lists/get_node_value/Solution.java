package bd.com.ronnie.hacking.hackerrank.data_structures.linked_lists.get_node_value;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        SinglyLinkedListNode(int data) {
            this.data = data;
            next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        SinglyLinkedListNode tail;

        SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
    }

    /**
     * insert node to the LinkedList sequentially.
     * this method is used to generate the LinkedList quickly.
     *
     * @param sll
     * @param data
     */
    static SinglyLinkedList insert(SinglyLinkedList sll, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (sll.head == null) { // no item in the LinkedList
            sll.head = newNode;
            sll.tail = newNode;
        } else {
            sll.tail.next = newNode;
            sll.tail = newNode;
        }
        return sll;
    }

    public static void main(String[] args) {
        // generate the linked list
        SinglyLinkedList sll1 = new SinglyLinkedList();
        insert(sll1, 16);
        insert(sll1, 13);
        insert(sll1, 11);
        insert(sll1, 15);
        insert(sll1, 3);

        // testing the solution
        System.out.println(
                getNode(sll1.head, 3)
        );
    }

    // solution method
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        int size = 0;
        SinglyLinkedListNode node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        node = head;
        for (int i = 0; i < size - positionFromTail - 1; i++) {
            node = node.next;
        }
        return node.data;
    }

}