package bd.com.ronnie.hacking.hackerrank.data_structures.linked_lists.merge_two_sorted_linked_lists;

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
        insert(sll1, 1);
        insert(sll1, 3);
        insert(sll1, 5);

        SinglyLinkedList sll2 = new SinglyLinkedList();
        insert(sll2, 2);
        insert(sll2, 4);
        insert(sll2, 6);

        // testing the solution
        printLinkedList(
                mergeLists(sll1.head, sll2.head)
        );
    }

    // solution method
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null && head2 == null) {
            return null;
        } else if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        } else {
            SinglyLinkedListNode merged;
            if (head1.data < head2.data) {
                merged = head1;
                merged.next = mergeLists(head1.next, head2);
            } else {
                merged = head2;
                merged.next = mergeLists(head1, head2.next);
            }
            return merged;
        }
    }

    private static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}