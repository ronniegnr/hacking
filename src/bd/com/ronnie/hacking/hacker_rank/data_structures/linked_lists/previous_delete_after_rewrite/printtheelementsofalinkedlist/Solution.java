package bd.com.ronnie.hackerrank.datastructures.linkedlists.printtheelementsofalinkedlist;

import java.util.Scanner;

public class Solution {

    private static class SinglyLinkedListNode {
        private int data;
        private SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }

    private static class SinglyLinkedList {
        private SinglyLinkedListNode head;
        private SinglyLinkedListNode tail;

        public SinglyLinkedList() {
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }
            this.tail = node;
        }
    }

    static void printLinkedList(SinglyLinkedListNode head) {
        if (head == null) {
            return;
        }

        SinglyLinkedListNode node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList linkedList = new SinglyLinkedList();

        int linkedListCount = scanner.nextInt();
        for (int i = 0; i < linkedListCount; i++) {
            int nodeData = scanner.nextInt();
            linkedList.insertNode(nodeData);
        }

        printLinkedList(linkedList.head);

        scanner.close();
    }

}
