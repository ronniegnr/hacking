package bd.com.ronnie.hackerrank.datastructures.linkedlists;

// this node will be used for both single and double linked list.
// for single linked list, we will not assign any value to Node.prev
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data = data;
    }

    public Node() {
    }
}


public class Solution {
    public static void main(String[] args) {
        // print the elements of a linked link
        // https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list
        /*
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        Print(node1);
        */

        // insert a node at the tail of a linked list
        // https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list
        /*
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        Node node = InsertTail(node1, 4);
        Print(node);
        */

        // insert a node at the head of a linked list
        // https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list
        /*
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        Node node = InsertHead(node1, 4);
        Print(node);
        */


        // insert a node at a specific position in a linked list
        // https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list
        /*
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        Node head = InsertNth(node1, 5, 4);
        Print(head);
        */ 

        // delete a node from linked list
        // https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list
        /*
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        Node head = Delete(node1, 0);
        Print(head);
        */

        // print in reverse
        // https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse
        // reverse a linked list + print linked list
        
        // reverse a linked list
        // https://www.hackerrank.com/challenges/reverse-a-linked-list/submissions/code/31188550  
        /*Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        Node head = Reverse(node1);
        Print(head);
        */

        // compare two linked lists
        // https://www.hackerrank.com/challenges/compare-two-linked-lists
        /*
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        Node head2 = Insert(null, 1);
        Insert(head2, 2);
        Insert(head2, 3);
        Insert(head2, 4);
        int isEqual = CompareList(node1, head2);
        System.out.println(isEqual);
        */
        
        // merge two sorted linked lists
        // https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists
        /*
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        Node head2 = Insert(null, 1);
        Insert(head2, 2);
        Insert(head2, 3);
        Insert(head2, 4);
        Node head = MergeLists(node1, head2);
        Print(head);
        */
        
        // get value of node at specific position from tail
        // https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail
        /*
        Node head = Insert(null, 2);
        Insert(head, 1);
        Insert(head, 3);
        Insert(head, 5);
        Insert(head, 6);
        System.out.println(GetValueWithTailPosition(head, 4));
        */
        
        // delete duplicate value nodes from a sorted linked list
        // https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list
        /*
        Node head = Insert(null, 1);
        Insert(head, 1);
        Insert(head, 1);
        Insert(head, 1);
        Insert(head, 6);
        Insert(head, 6);
        head = RemoveDuplicates(head);
        Print(head);
        */

        // detect whether a linked list contains a cycle
        // https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle
        /*
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node2;
        System.out.println(HasCycle(node1));
        */
        
        // find the merge point of two joined linked list
        // https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists
        /*
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node5.next = node3;
        System.out.println(FindMergeNode2(node1, node5));
        */ 

        // insert a node into a sorted doubly linked list
        // https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list
        /*
        Node node1 = new Node(2);
        Node node2 = new Node(4);
        Node node3 = new Node(5);
        Node node4 = new Node(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.prev = node3;
        node3.prev = node2;
        node2.prev = node1;
        Node head = SortedInsert(node1, 8);
        Print(head);
        */

        // reverse a doubly link list
        // https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list
        Node node1 = new Node(2);
        Node node2 = new Node(4);
        Node node3 = new Node(5);
        Node node4 = new Node(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.prev = node3;
        node3.prev = node2;
        node2.prev = node1;
        Node head = DReverse(node1);
        Print(head);

    }


    static Node DReverse(Node head) {
        if(head == null) {
            return null;
        }
        else if(head.next == null) {
            return head;
        }

        Node current = head;
        Node tmp = new Node();
        while(current != null) {
            tmp = current.prev;
            current.prev = current.next;
            current.next = tmp;
            current = current.prev;
        }

        return tmp.prev;
    }


    static Node SortedInsert(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;
        Node node = head;
        
        Node prevNode = new Node();
        while(node != null) {
            if(node.data > newNode.data) {
                node.prev.next = newNode;
                newNode.prev = node.prev;
                newNode.next = node;
                node.prev = newNode;
                return head;
            }
            prevNode = node;
            node = node.next;
        }

        prevNode.next = newNode;
        newNode.prev = prevNode;
        return head;
    }


    static int FindMergeNode2(Node headA, Node headB) {
        Node nodeA = headA, nodeB = headB;
        while(nodeA != nodeB) {
            nodeA = nodeA.next;
            nodeB = nodeB.next;
            if(nodeA == null) {
                nodeA = headB;
            }
            if(nodeB == null) {
                nodeB = headA;
            }
            if(nodeA == nodeB) {
                return nodeA.data;
            }
        }
        return 0;
    }


    // it is assumed that, two linked lists are joined and heads will not be null
    static int FindMergeNode1(Node headA, Node headB) {
        int sizeA = 0, sizeB = 0;
        
        Node node = headA;
        while(node!=null) {
            sizeA++;
            node = node.next;
        }

        node = headB;
        while(node!=null) {
            sizeB++;
            node = node.next;
        }

        if(sizeA > sizeB) {
            node = headA;
            for(int i=sizeA-sizeB; i>0; i--) {
                node = node.next;
            }
            headA = node;
        } else {
            node = headB;
            for(int i=sizeB-sizeA; i>0; i--) {
                node = node.next;
            }
            headB = node;
        }

        Node nodeA = headA;
        Node nodeB = headB;
        while(nodeA.data != nodeB.data) {
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }

        return nodeA.data;
        
    }


    // tortoise-hare algorithm - http://stackoverflow.com/questions/2663115/how-to-detect-a-loop-in-a-linked-list
    static boolean HasCycle(Node head) {
        if(head == null || head.next == null) {
            return false;
        }

        Node slow, fast;
        slow = fast = head;

        while(true) {
            slow = slow.next;

            if(fast.next != null) {
                fast = fast.next.next;
            } else {
                return false;
            }

            if(slow == null || fast == null) {
                return false;
            }

            if(slow == fast) {
                return true;
            }
        }
    }


    static Node RemoveDuplicates(Node head) {
        if(head == null) {
            return head;
        }

        Node node = head;

        while(node != null) {
            if(node.next!=null && node.data == node.next.data) {
                node.next = node.next.next;
            } else {
            node = node.next;
            }
        }

        return head;
    }


    static int GetValueWithTailPosition(Node head, int n) {
        int size = 0;
        Node node = head;

        while(node != null) {
            size++;
            node = node.next;
        }

        int positionFromHead = size - n - 1;
        node = head;
        for(int i=0; i<positionFromHead; i++) {
            node = node.next;
        }

        return node.data;
    }


    static Node MergeLists(Node headA, Node headB) {
        if(headA == null) {
            return headB;
        } else if(headB == null) {
            return headA;
        }

        Node node1 = headA;
        Node node2 = headB;
        Node head = new Node();
        Node cursor = new Node();

        head = node1.data<node2.data ? node2 : node2;
        if(node1.data < node2.data) {
            head = node1;
            node1 = node1.next;
        } else {
            head = node2;
            node2 = node2.next;
        }
        cursor = head;

        while(node1!=null && node2!=null) {
            Node tmp = new Node();
            if(node1.data < node2.data) {
                tmp = node1;
                node1 = node1.next;
            }
            else {
                tmp = node2;
                node2 = node2.next;
            }
            cursor.next = tmp;
            cursor = tmp;
        }

        if(!(node1==null && node2==null)) {
            cursor.next = node1==null ? node2 : node1;
        }

        return head;
    }


    static int CompareList(Node headA, Node headB) {
        Node node1 = headA;
        Node node2 = headB;
        int isEqual = 0;

        if(node1 == null && node2 == null) {
            isEqual = 1;
            return isEqual;
        }
        else if((node1 == null && node2 != null) || (node1 != null && node2 == null)) {
            isEqual = 0;
            return isEqual;
        }

        while(node1!=null && node2!=null) {
            if(node1.data != node2.data) {
                return isEqual;
            }
            else {
                node1 = node1.next;
                node2 = node2.next;
            }
        }

        return node1==node2 ? 1 : 0;
    }


    static Node Reverse(Node head) {
        if(head == null) {
            return null;
        }

        Node current = head;
        Node after = head.next;
        Node tmp = new Node();

        while(after != null) {
            tmp = after.next;
            after.next = current;
            current = after;
            after = tmp;
        }

        head.next = null;
        return current;
    }


    static Node Delete(Node head, int position) {
        if(position == 0) {
            return head.next;
        }

        Node beforeDelete = head;
        for(int i=0; i<position-1; i++) {
            beforeDelete = beforeDelete.next;
        }
        Node nextDelete = beforeDelete.next.next;
        beforeDelete.next = nextDelete;
        return head;
    }


    static Node InsertNth(Node head, int data, int position) {
        Node node = new Node();
        node.data = data;

        if(position == 0) {
            node.next = head;
            return node;
        }

        Node previous = head;
        for(int i=0; i<position-1; i++) {
            previous = previous.next;
        }

        Node later = previous.next;
        previous.next = node;
        node.next = later;

        return head;
    }
 

    static Node InsertHead(Node head, int x) {
        Node node = new Node();
        node.data = x;
        node.next = head;
        return node;
    }


    static Node InsertTail(Node head, int data) {
        Node node = new Node(data);
        if(head == null) {
            return node;
        }
        
        // find the tail of the linked list from head
        Node tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }
        
        tail.next = node;
        return head;
    }

    
    static void Print(Node head) {
        if(head == null) {
            return;
        }

        System.out.println(head.data);
        Print(head.next);
    }
   
}
