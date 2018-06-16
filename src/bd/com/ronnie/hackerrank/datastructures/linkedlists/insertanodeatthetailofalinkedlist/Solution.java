package bd.com.ronnie.hackerrank.datastructures.linkedlists.insertanodeatthetailofalinkedlist;

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

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (head == null) {
            head = node;
        } else {
            SinglyLinkedListNode tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = node;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList linkedList = new SinglyLinkedList();

        int linkedListCount = scanner.nextInt();
        for (int i = 0; i < linkedListCount; i++) {
            int nodeData = scanner.nextInt();
            insertNodeAtTail(linkedList.head, nodeData);
        }

        printLinkedList(linkedList.head);

        scanner.close();
    }

}

// https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
