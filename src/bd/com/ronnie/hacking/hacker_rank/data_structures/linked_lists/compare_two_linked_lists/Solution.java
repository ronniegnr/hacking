package bd.com.ronnie.hacking.hacker_rank.data_structures.linked_lists.compare_two_linked_lists;

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

        SinglyLinkedList sll2 = new SinglyLinkedList();
        insert(sll2, 16);
        insert(sll2, 13);
        insert(sll2, 111);

        // testing the solution
        System.out.println(compareLists(sll1.head, sll2.head));
    }

    // solution method
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        boolean isEqual = true;

        SinglyLinkedListNode node1 = head1;
        SinglyLinkedListNode node2 = head2;

        while (true) {
            if (node1 == null && node2 == null) {
                break;
            } else if (node1 == null || node2 == null) {
                isEqual = false;
                break;
            }
            if (node1.data != node2.data) {
                isEqual = false;
                break;
            }
            node1 = node1.next;
            node2 = node2.next;
        }

        return isEqual;
    }

}