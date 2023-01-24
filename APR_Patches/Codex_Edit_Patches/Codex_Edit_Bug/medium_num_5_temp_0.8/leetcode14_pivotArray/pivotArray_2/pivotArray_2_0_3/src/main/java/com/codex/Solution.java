package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0, j = nums.length-1;
        while (i <= j) {
            if (nums[i] < pivot) {
                i++;
            } else if (nums[j] > pivot) {
                j--;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }


















    static class LinkNode {
        int val;
        LinkNode next;
        LinkNode(int x) {
            val = x;
        }
    }
    public static LinkNode partition(LinkNode node, int x) {
        LinkNode beforeStart = null;
        LinkNode beforeEnd = null;
        LinkNode afterStart = null;
        LinkNode afterEnd = null;
        while (node != null) {
            LinkNode next = node.next;

            node.next = null;
            if (node.val < x) {
                if (beforeStart == null) {
                    beforeStart = node;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            } else {
                if (afterStart == null) {
                    afterStart = node;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = next;
        }
        if (beforeStart == null) {
            return afterStart;
        }
        beforeEnd.next = afterStart;
        return beforeStart;
    }

    public static void main(String[] args) {
        LinkNode head = new LinkNode(3);
        head.next = new LinkNode(5);
        head.next.next = new LinkNode(8);
        head.next.next.next = new LinkNode(5);
        head.next.next.next.next = new LinkNode(10);
        head.next.next.next.next.next = new LinkNode(2);
        head.next.next.next.next.next.next = new LinkNode(1);

        LinkNode node = partition(head, 5);
        while (node != null) {
            System.out.println(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    
}