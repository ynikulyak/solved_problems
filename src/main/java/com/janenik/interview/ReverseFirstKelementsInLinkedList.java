package com.janenik.interview;

/**
 * Created by jane on 11/4/20.
 */
public class ReverseFirstKelementsInLinkedList {

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node result = reverse(head, 4);
        System.out.print("Nodes of the reversed LinkedList are: ");
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }

    public static Node reverse(Node head, int k){
        if(head == null || head.next == null || k < 2){
            return head;
        }

        Node current = head;
        Node start = head;
        Node prev = null;
        int count = 0;

        while(count < k && current != null){
            Node temp = current.next;
            current.next = prev;

            prev = current;
            current = temp;
            count++;
        }
        start.next = current;

        head = prev;
        return head;
    }
}

class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
    }
}