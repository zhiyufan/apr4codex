package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return null;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return Integer.toString(minHeap.peek());
    }

    private static int com(int a, int b) {
        String s1 = a + "" + b;
        String s2 = b + "" + a;
        int lenA = s1.length();
        int lenB = s2.length();
        int i = 0;
        while (i < lenA || i < lenB) {
            if (i < lenA && i < lenB) {
                if (s1.charAt(i) < s2.charAt(i)) {
                    return 1;
                } else if (s1.charAt(i) > s2.charAt(i)) {
                    return -1;
                } else {
                    i++;
                }
            } else {
                if (i < lenA) {
                    return s1.charAt(i) < s1.charAt(0) ? 1 : -1;
                } else {
                    return s2.charAt(i) < s2.charAt(0) ? -1 : 1;
                }
            }
        }
        return 0;
    }
    
    
}