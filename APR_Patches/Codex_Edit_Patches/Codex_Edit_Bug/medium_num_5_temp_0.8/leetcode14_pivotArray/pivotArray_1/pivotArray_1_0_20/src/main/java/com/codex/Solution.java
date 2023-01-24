package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            while (i <= j && nums[i] < pivot) {
                i++;
            }
            while (i <= j && nums[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }




    public static class RecursionLinkedListReversal {
        public static Node reverse(Node head) {
            if (head == null || head.next == null) return head;
            Node newHead = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }

    public static Node reverseIteratively(Node head) {
        Node newHead = null;
        while (head != null) {
            Node temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }




    public static Node merge(Node one, Node two) {
        Node dummyHead = new Node(0, null);
        Node cur = dummyHead;
        Node p1 = one;
        Node p2 = two;
        while (p1 != null && p2 != null) {
            if (p1.value < p2.value) {
                cur.next = p1;
                p1 = p1.next;
            } else {
                cur.next = p2;
                p2 = p2.next;
            }
            cur = cur.next;
        }
        if (p1 != null) {
            cur.next = p1;
        } else {
            cur.next = p2;
        }
        return dummyHead.next;
    }




    public static Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // step 1. cut the list to two halves
        Node prev = null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        // step 2. sort each half
        Node l1 = sort(head);
        Node l2 = sort(slow);
        // step 3. merge l1 and l2
        return merge(l1, l2);
    }



    public static class RecursionLinkedListReversal {
        public static Node reverse(Node head) {
            if (head == null || head.next == null) return head;
            Node newHead = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }

    public static Node reverseIteratively(Node head) {
        Node newHead = null;
        while (head != null) {
            Node temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }



    public static class RecursionLinkedListReversal {
        public static Node reverse(Node head) {
            if (head == null || head.next == null) return head;
            Node newHead = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }

    public static Node reverseIteratively(Node head) {
        Node newHead = null;
        while (head != null) {
            Node temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }












    
}