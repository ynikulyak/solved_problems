package com.janenik.interview;

/**
 * Created by jane on 11/5/20.
 */
public class ReverserLLwithNnodes {

    public static void main(String[] args){
        int i = 2;
        Node head = new Node(1);
        Node curr = head;
        while(i <= 10){
            curr.next = new Node(i);
            curr = curr.next;
            i++;
        }
        head = reverseList(head, 10);
        Node current = head;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    public static Node reverseList(Node head, int n){
        if(head == null || head.next == null || n <4){
            return head;
        }

        Node last = head;
        Node start = null;
        Node current = head;
        if(n % 2 == 0){
           Node next = findNode(head, n/2+1);
           head = reverse(head, 1, n/2);
           start = head;
           last.next = next;
           head = reverse(head, n/2+1, n);
           last.next = head;

        }else{
            Node middle = findNode(head, n/2+1);
            head = reverse(head, 1, n/2);
            start = head;
            last.next = middle;
            head = reverse(head, n/2+2, n);
            middle.next = head;
        }
        return start;
    }

    private static Node findNode(Node head, int position){
        if(head == null || head.next == null || position < 1){
            return head;
        }

        Node current = head;
        Node prev = null;
        while(position > 0 && current != null){
            prev=current;
            current = current.next;
            position--;
        }
        return prev;
    }

    private static Node reverse(Node head, int start, int end){
        if(head == null || head.next == null){
            return head;
        }

        Node current = head;
        Node prev = null;

        int count = 1;
        while(count < start && current != null){
            current = current.next;
            count++;
        }
        while(count <= end && current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
            count++;
        }

        return prev;
    }
}
