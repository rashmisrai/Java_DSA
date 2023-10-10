package com.algo;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class Linkedlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Create the linked list
        ListNode head = null;
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            head = insertNode(head, val);
        }

        // Check if the linked list is a palindrome
        int result = isPalindrome(head);
        System.out.println(result);

        scanner.close();
    }

    // Function to insert a node at the end of the linked list
    public static ListNode insertNode(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            return newNode;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    // Function to check if a linked list is a palindrome
    public static int isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return 1; // A single element or empty list is considered a palindrome
        }

        ListNode slow = head;
        ListNode fast = head;

        // Find the middle of the linked list using two pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        ListNode reversedHalf = reverseList(slow);

        // Compare the first half with the reversed second half
        ListNode p1 = head;
        ListNode p2 = reversedHalf;
        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                return 0; // Not a palindrome
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return 1; // Palindrome
    }

    // Function to reverse a linked list
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
