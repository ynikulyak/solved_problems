package com.janenik.interview;

import java.util.*;

/**
 * Created by jane on 11/3/20.
 */
class ListNode {
    int value = 0;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}

public class ReverseSubList {

    public static ListNode reverse(ListNode head, int p, int q) {

        ListNode current = head;
        ListNode prev = null;

        ListNode pStart = null;
        ListNode qEnd = null;

        int count = 1;

        while (count < p && current != null) {
            prev = current;
            current = current.next;
            count++;
        }

        pStart = current;
        while (count <= q && current != null) {
            ListNode temp = current.next;

            current.next = qEnd;
            qEnd = current;
            current = temp;
            count++;
        }

        if(prev != null) {
            prev.next = qEnd;
        }else{
            head = qEnd;
        }

        pStart.next = current;

        // TODO: Write your code here
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = ReverseSubList.reverse(head, 2, 4);
        System.out.print("Nodes of the reversed LinkedList are: ");
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }
}
