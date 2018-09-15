package bd.com.ronnie.hacking.hacker_rank.data_structures.linked_lists.insert_a_node_at_the_tail_of_a_linked_list;

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

        public SinglyLinkedList() {
            this.head = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(16);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(13);
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.head = node1;
        node1.next = node2;

        // testing the solution  method
        printLinkedList(
            insertNodeAtTail(linkedList.head, 5)
        );
    }

    // Solution method of the problem
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode node = head;

        if(head == null) {
            head = newNode;
        } else {
            while(true) {
                if(node.next == null) {
                    break;
                } else {
                    node = node.next;
                }
            }
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