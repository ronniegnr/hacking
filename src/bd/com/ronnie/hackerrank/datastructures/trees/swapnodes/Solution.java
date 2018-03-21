package bd.com.ronnie.hackerrank.datastructures.trees.swapnodes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
    protected Node left;
    protected Node right;
    protected int data;
    protected int depth;

    public Node(int data) {
        this.data = data;
        left = right = null;
        depth = 0;
    }

    public Node() { }

    public Node left(Node left) {
        this.left = left;
        return this;
    }

    public Node right(Node right) {
        this.right = right;
        return this;
    }

    public Node data(int data) {
        this.data = data;
        return this;
    }

    public Node depth(int depth) {
        this.depth = depth;
        return this;
    }

    @Override
    public String toString() {
        return "Node{" +
            "data=" + this.data +
            ", left='" + this.left + "'" +
            ", right='" + this.right + 
            ", depth=" + this.depth +
            '}';
    }
}


public class Solution {
    public static void main(String... args) throws Exception {
        // generate the tree from input
        // Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(new File("tree.txt"));
        int nodeCount = scanner.nextInt();

        Node[] nodes = new Node[nodeCount];
        for(int i=0; i<nodeCount; i++) {
            nodes[i] = new Node(i+1);
        }
        Node root = nodes[0]; 

        for(int i=0; i<nodeCount*2; i++) {
            Node node = nodes[i/2];
            int input = scanner.nextInt();
            if(input != -1) {
                Node inputNode = nodes[input-1];
                if(i%2 == 0) {
                    node.left = inputNode;
                } else {
                    node.right = inputNode;
                }
            }
        }

        // depth assign to each tree nodes
        assignDepth(root, 1);
        for(int i=0; i<nodeCount; i++) {
            Node node = nodes[i];
        }

        // take input, find swappable nodes and swap their left and right subtree
        int T = scanner.nextInt(); // swap count
        for(int i=0; i<T; i++) {
            int K = scanner.nextInt();
            
            // find swappable nodes
            List<Node> swappableNodes = new ArrayList<>();
            for(int j=0; j<nodeCount; j++) {
                Node node = nodes[j];
                if(node.depth % K == 0) {
                    swappableNodes.add(node);
                }
            }
            
            // swap swappable nodes left and right subtree
            for(Node node : swappableNodes) {
                Node temp = node.left;
                node.left = node.right;
                node.right = temp;
            }

            inorder(root);
            System.out.println("");
        }

    }

    static void assignDepth(Node node, int depth) {
        if(node != null) {
            assignDepth(node.left, depth+1);
            node.depth = depth;
            assignDepth(node.right, depth+1);
        }
    }

    static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
