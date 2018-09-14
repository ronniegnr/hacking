package bd.com.ronnie.hackerrank.datastructures.linkedlists.insertnodeattheheadofalinkedlist;

import java.util.Scanner;

public class Solution {

    private static class SinglyLinkedListNode {
        private int data;
        private SinglyLinkedListNode next;

        SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }

    private static class SinglyLinkedList {
        private SinglyLinkedListNode head;
        private SinglyLinkedListNode tail;

        SinglyLinkedList() {
        }
    }

    private static void printLinkedList(SinglyLinkedListNode head) {
        if (head == null) {
            return;
        }

        SinglyLinkedListNode node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (head != null) {
            node.next = head;
        }
        head = node;
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList linkedList = new SinglyLinkedList();

        int linkedListCount = scanner.nextInt();
        for (int i = 0; i < linkedListCount; i++) {
            int nodeData = scanner.nextInt();
            linkedList.head = insertNodeAtHead(linkedList.head, nodeData);
        }

        printLinkedList(linkedList.head);

        scanner.close();
    }

}

// https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
