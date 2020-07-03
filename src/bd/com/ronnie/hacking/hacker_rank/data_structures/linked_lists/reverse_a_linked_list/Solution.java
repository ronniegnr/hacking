package bd.com.ronnie.hacking.hackerrank.data_structures.linked_lists.reverse_a_linked_list;

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
            reverse(sll.head)
        );
    }

    // solution method
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if(head == null || head.next == null) {
            return head;
        } else {
            SinglyLinkedListNode node = head;
            SinglyLinkedListNode nextNode = head.next;
            SinglyLinkedListNode temp;
            while(nextNode != null) {
                temp = nextNode.next;
                nextNode.next = node;
                node = nextNode;
                nextNode = temp;
            }
            head.next = null;
            return node;
        }
    }

    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}