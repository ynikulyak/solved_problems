package com.janenik.BinarySearchTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * Created by jane on 7/27/17.
 */
public class BST {

    private Node root;

    public static void main(String[] arg) throws IOException, FileNotFoundException {
        BST tree = new BST();

        tree.insert(4);
        tree.insert(6);
        tree.insert(100);
        tree.insert(0);
        tree.insert(2);
        tree.insert(9);
        tree.insert(8);
        tree.insert(12);

        tree.inorderPrint();
        System.out.println("\nInorder print iterative: ");
        tree.inorderPrintIterative();
        System.out.println("\nLevel order traversal: ");
        tree.levelOrderTraversal();
        System.out.println("\nTree size is " + tree.size());
        System.out.println("Postorder traversal");
        tree.postorderPrint();

        System.out.println();
        FileOutputStream fos = new FileOutputStream(new File("/Users/jane/mybinarysearchtree.txt"));

        tree.levels((Integer level, List<Integer> list) -> {
            String levelString = "Level: " + level + ": " + list;
            try {
                fos.write(levelString.getBytes(Charset.forName("UTF-8")));
                fos.write(13);
                fos.write(10);
            } catch (IOException ioe) {
                // IGNORE.
            }
        });

        fos.close();

        tree.preOrderIter();
    }

    public int maxValRec(){
        return maxValueRec(root);
    }

    public void preorderPrint() {
        preorderPrint(root);
    }

    public void inorderPrint() {
        inorderPrint(root);
    }

    public void postorderPrint() {
        postorderPrint(root);
    }

    public boolean findRecusive(int data) {
        return findRecursive(root, data);
    }

    public boolean find(int data){
        return find(root, data);
    }
    private boolean find(Node node, int data) {
        Node current = node;

        while (current != null) {
            if (current.data == data) {
                return true;
            }
            if (current.data > data) {
                current = current.left;
            }

            if (current.data < data) {
                current = current.right;
            }
        }

        return false;
    }

    public void insert(int data) {

        if (root == null) {
            root = new Node(data);
            return;
        }
        Node current = root;
        while (true) {

            if (current.data > data) {
                if (current.left == null) {
                    current.left = new Node(data);
                    return;
                } else {
                    current = current.left;
                }
            }

            if (current.data < data) {
                if (current.right == null) {
                    current.right = new Node(data);
                    return;
                } else {
                    current = current.right;
                }
            }
        }
    }



    public int size() {
        return size(root);
    }

    public int sizeIter() {
        return sizeIter(root);
    }

    public int maxValue() {
        return maxValue(root);
    }

    public int minValue() {
        return minValue(root);
    }

    public int minValueRec() {
        return minValue(root);
    }

    public int maxValueRec() {
        return maxValueRec(root);
    }


    public int height() {
        return maxDepth(root);
    }

    public void inorderPrintIterative() {
        inorderPrintIterative(root);
    }

    public void levelOrderTraversal() {
        levelOrderTraversal(root);
    }

    public int heightIter() {
        return maxDepthIter(root);
    }


    public boolean isBST() {
        return isBST(root);
    }

    public int kSmallestElement(int k){
        return kSmallestElement(root, k);
    }

    private int kSmallestElement(Node node, int k){
        if (node == null){
            return -1;
        }

        //make inorder traversal
        Stack<Node> s = new Stack<>();
        Node cur = node;

        while(cur != null){
            s.push(cur);
            cur = cur.left;
        }

        int count = 0;
        while(s.size() > 0){
            cur = s.pop();
            count++;

            if(count == k){
                return cur.data;  //stop when found
            }

            if(cur.right != null){
                cur = cur.right;

                while (cur != null){
                    s.push(cur);
                    cur = cur.left;
                }
            }
        }
        return -1; //not found
    }
    private int maxValueRec(Node node) {

        if (node.right == null) {
            return node.data;
        }
        return maxValueRec(node.right);

    }

    private boolean isBST(Node node) {

        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        Node current = node;

        while (current != null) {
            stack.push(current);
            current = current.left;
        }

        while (stack.size() > 0) {
            current = stack.pop();
            arrayList.add(current.data);

            if (current.right != null) {
                current = current.right;

                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }
            }

        }

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i - 1) >= arrayList.get(i)) {
                return false;
            }
        }

        return true;
    }

    public void preOrderIter(){
        preOderIter(root);
    }

    private void preOderIter(Node node){
        if (node == null){
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node current = node;
        stack.push(current);

        while(stack.size() > 0){
            current = stack.pop();
            System.out.print(current.data + " ");

            if(current.right != null){
                stack.push(current.right);
            }

            if(current.left != null){
                stack.push(current.left);
            }
        }
    }

    public void levels(BiConsumer<Integer, List<Integer>> nodeConsumer) {
        levels(root, nodeConsumer);
    }

    private void levels(Node node, BiConsumer<Integer, List<Integer>> nodeConsumer) {
        if (node == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        int level = 0;
        List<Integer> currentLevelNodes = new ArrayList<>();

        while (true) {

            int nodeCount = queue.size();
            if (nodeCount == 0) {
                break;
            }

            if (level > 0) {
                nodeConsumer.accept(level, currentLevelNodes);
                currentLevelNodes.clear();
            }
            level++;

            while (nodeCount > 0) {
                Node newNode = queue.remove();

                currentLevelNodes.add(newNode.data);

                if (newNode.left != null) {
                    queue.add(newNode.left);
                }

                if (newNode.right != null) {
                    queue.add(newNode.right);
                }
                nodeCount--;
            }
        }
        nodeConsumer.accept(level, currentLevelNodes);
    }

    private int maxDepthIter(Node node) {
        if (node == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        int height = 0;

        while (true) {

            int nodeCount = queue.size();
            if (nodeCount == 0) {
                return height;
            }

            height++;

            while (nodeCount > 0) {
                Node newNode = queue.peek();
                queue.remove();

                if (newNode.left != null) {
                    queue.add(newNode.left);
                }
                if (newNode.right != null) {
                    queue.add(newNode.right);
                }
                nodeCount--;
            }
        }
    }

    private void levelOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        Node current = node;
        queue.add(current);

        while (queue.size() > 0) {
            current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    private void inorderPrintIterative(Node node) {
        if (node == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node current = node;

        while (current != null) {
            stack.push(current);
            current = current.left;
        }

        while (stack.size() > 0) {
            current = stack.pop();
            System.out.print(current.data + " ");

            if (current.right != null) {
                current = current.right;

                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }
            }
        }
    }

    private int maxDepth(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(node.right), maxDepth(node.left));
    }

    private int minValueRec(Node node) {
        if (node.left == null) {
            return node.data;
        }
        return minValue(node.left);
    }

    private int minValue(Node node) {
        if (node == null) {
            return 0;
        }

        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    private int maxValRec(Node node){
        if(node.right == null){
            return node.data;
        }
        return maxValueRec(node.right);
    }

    private int maxValue(Node node) {
        if (node == null) {
            return 0;
        }

        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }

    private int sizeIter(Node node) {

        if (node == null) {
            return 0;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(node);
        int count = 0;

        while (!stack.isEmpty()) {
            Node poppedNode = stack.pop();
            count++;

            if (poppedNode.right != null) {
                stack.push(poppedNode.right);
            }

            if (poppedNode.left != null) {
                stack.push(poppedNode.left);
            }

        }
        return count;
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        return size(node.left) + 1 + size(node.right);
    }

    private boolean findRecursive(Node node, int data) {
        if (node == null) {
            return false;
        }

        if (node.data == data) {
            return true;
        } else if (node.data > data) {
            return findRecursive(node.left, data);
        }
        return findRecursive(node.right, data);
    }

    private void preorderPrint(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderPrint(node.left);
            preorderPrint(node.right);
        }
    }

    private void inorderPrint(Node node) {
        if (node != null) {
            inorderPrint(node.left);
            System.out.print(node.data + " ");
            inorderPrint(node.right);
        }
    }

    private void postorderPrint(Node node) {
        if (node != null) {
            postorderPrint(node.left);
            postorderPrint(node.right);
            System.out.print(node.data + " ");
        }
    }
}
