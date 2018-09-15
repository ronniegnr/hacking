

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
        sll = insert(sll, 11);

        // testing the solution
        printLinkedList(
            insertNodeAtPosition(sll.head, 3, 2)
        );
    }

    // solution method
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if(head != null) {
            SinglyLinkedListNode node = head;
            for (int i = 0; i < position-1; i++) {
                if(node.next == null) {
                    break;
                } else {
                    node = node.next;
                }
            }
            newNode.next = node.next;
            node.next = newNode;
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