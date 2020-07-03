package bd.com.ronnie.hackerrank.datastructures.trees;

import java.lang.Math;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class Node {
    protected Node left;
    protected Node right;
    protected int data;

    public Node(int data) {
        this.data = data;
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

    @Override
    public String toString() {
        return "Node{" +
            "data=" + this.data +
            ", left='" + this.left + "'" +
            ", right='" + this.right + 
            '}';
    }

}

class NodeHuffman {
    protected NodeHuffman left;
    protected NodeHuffman right;
    protected char data;
    protected int freq;

    public NodeHuffman(char data, int freq) {
        this.data = data;
        this.freq = freq;
    }

    public NodeHuffman() { }

    public NodeHuffman left(NodeHuffman left) {
        this.left = left;
        return this;
    }

    public NodeHuffman right(NodeHuffman right) {
        this.right = right;
        return this;
    }

    public NodeHuffman data(char data) {
        this.data = data;
        return this;
    }

    public int freq(int freq) {
        this.freq = freq;
        return freq;
    }

    @Override
    public String toString() {
        return "NodeHuffman{" +
            "data=" + this.data +
            ", left='" + this.left + "'" +
            ", right='" + this.right +
            ", freq='" + this.freq + 
            '}';
    }

}


public class Solution {

    static Node generateTree1() {
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(1);
        Node node4 = new Node(4);
        Node node5 = new Node(2);
        Node node6 = new Node(6);

        node1.left(node2)
             .right(node5);
        node2.left(node3)
             .right(node4);
        node5.left(node6);

        return node1;
    }

    static Node generateBST() {
        Node node1 = new Node(4);
        Node node2 = new Node(2);
        Node node3 = new Node(1);
        Node node4 = new Node(3);
        Node node5 = new Node(7);
        
        node1.left(node2)
             .right(node5);
        node2.left(node3)
             .right(node4);

        return node1;
    }

    static NodeHuffman generateHuffmanTree() {
        NodeHuffman node1 = new NodeHuffman((char)966, 5);
        NodeHuffman node2 = new NodeHuffman((char)966, 2);
        NodeHuffman node3 = new NodeHuffman('B', 1);
        NodeHuffman node4 = new NodeHuffman('C', 1);
        NodeHuffman node5 = new NodeHuffman('A', 3);

        node1.left(node2)
             .right(node5);
        node2.left(node3)
             .right(node4);

        return node1;
    }

    public static void main(String[] args) throws Exception {
        Node root;

        // preorder traversal
        // root = generateTree1();
        // preOrder(root);

        // postorder traversal
        // root = generateTree1();
        // postOrder(root);

        // inorder traversal
        // root = generateTree1();
        // inOrder(root);

        // height of a binary tree
        // root = generateTree1();
        // System.out.println(getHeight(root));
        
        // top view of a tree
        // root = generateTree1();
        // top_view(root);

        // level order traverse
        // root = generateTree1();
        // LevelOrder(root);
        
        // BST insertion
        // root = generateBST();
        // LevelOrder(Insert(root, 6));
        
        // Huffman Decoding
        // NodeHuffman root1 = generateHuffmanTree();
        // decode("1001011", root1);

        // LCA for BST
        // root = generateBST();
        // Node lcaNode = lca(root, 2, 3);
        // System.out.println(lcaNode.data);
        
        // Is binary search tree
        //root = generateBST();
       root = generateTree1();
        System.out.println(checkBST(root));

    }

    static List<Integer> result = new ArrayList<Integer>();
    static void listInorder(Node root) {
        if(root == null) {
            return;
        }
        listInorder(root.left);
        result.add(root.data);
        listInorder(root.right);
    }

    static boolean checkBST(Node root) {
        listInorder(root);
        List<Integer> tmp = new ArrayList<>(result);
        Set<Integer> stmp = new HashSet<>(result);
        if(tmp.size() == stmp.size()) {
        	Collections.sort(tmp);
        	return tmp.equals(result);
        }
        return false;
    }

    static Node lca(Node root, int v1, int v2) {
        if(root == null) {
            return null;
        }

        if(v1 > v2) {
            v1 = v1+v2;
            v2 = v1-v2;
            v1 = v1-v2;
        }

        while(v1>root.data || v2<root.data) {
            if(v1>root.data) {
                root = root.right;
            } else if(v2<root.data) {
                root = root.left;
            }
        }

        return root;
    }

    // LCA for BST in recursive approach, but above approach is better
    static Node lca2(Node root, int v1, int v2) {
        if(root == null) {
            return null;
        }
        if(Integer.max(v1, v2) < root.data) {
            return lca(root.left, v1, v2);
        }
        else if(Integer.min(v1, v2) > root.data) {
            return lca(root.right, v1, v2);
        }
        else {
            return root;
        }
    }

    static void decode(String S, NodeHuffman root) {
        char[] chars = S.toCharArray();
        NodeHuffman node = root;
        String decodedString = "";

        for(char c : chars) {
            if(c == '1') {
                node = node.right;
            } else if(c == '0') {
                node = node.left;
            }

            if(node.left == null && node.right == null) {
                decodedString += node.data;
                node = root;
            }
        }

        System.out.println(decodedString);
    }

    static Node Insert(Node root, int value) {
        Node newNode = new Node();
        newNode.data = value;

        if(root == null) {
            return newNode;
        }

        Node preNode = root;
        Node node = root;

        while(node != null) {
            preNode = node;
            if(value > node.data) {
                node = node.right;
            } else {
                node = node.left;
            }
        }

        if(value > preNode.data) {
            preNode.right = newNode;
        } else {
            preNode.left = newNode;
        }

        return root;
    }

    static void LevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node temp = null;

        while(!queue.isEmpty()) {
            temp = queue.remove();
            System.out.print(temp.data + " ");
            if(temp.left != null) {
                queue.add(temp.left);
            }
            if(temp.right != null) {
                queue.add(temp.right);
            }
        }

    }
    


    static void top_view_traverse(Node node, boolean isLeft) {
        if(node == null) {
            return;
        }

        if(isLeft) {
            top_view_traverse(node.left, true);
            System.out.print(node.data + " ");
        } else {
            System.out.print(node.data + " ");
            top_view_traverse(node.right, false);
        }
    }
    // this is not a complete solution. it will fail in some cases. i.e if left branch of right side tree, exceededge of left tree, it will fail. for complete solution all node need to traverse and mark level with them. then printing the node in level sort wise.
    static void top_view(Node root) {
        top_view_traverse(root.left, true);
        System.out.print(root.data + " ");
        top_view_traverse(root.right, false);
    }

    static int getHeight(Node root) {
        if(root == null ){
            return -1;
        }

        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

}
