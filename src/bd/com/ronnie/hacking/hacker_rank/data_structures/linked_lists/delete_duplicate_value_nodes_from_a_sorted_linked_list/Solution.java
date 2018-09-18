package bd.com.ronnie.hacking.hacker_rank.data_structures.linked_lists.delete_duplicate_value_nodes_from_a_sorted_linked_list;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
            next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
    }

    /**
     * insert node to the LinkedList sequentially.
     * this method is used to generate the LinkedList quickly.
     * @param sll
     * @param data
     */
    static SinglyLinkedList insert(SinglyLinkedList sll, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if(sll.head == null) { // no item in the LinkedList
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
        SinglyLinkedList sll = new SinglyLinkedList();
        sll = insert(sll, 16);
        sll = insert(sll, 13);
        sll = insert(sll, 13);
        sll = insert(sll, 11);

        // testing the solution
        printLinkedList(
                removeDuplicates(sll.head)
        );
    }

    // solution method
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if (head == null) {
            return head;
        }

        SinglyLinkedListNode node = head;
        SinglyLinkedListNode nextNode = head.next;
        if (nextNode == null) {
            return head;
        }

        while (nextNode != null) {
            if (node.data == nextNode.data) {
                node.next = nextNode.next;
                nextNode = node.next;
            } else {
                node = node.next;
                nextNode = nextNode.next;
            }
        }

        return head;
    }

    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}