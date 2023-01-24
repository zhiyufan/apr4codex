package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        if (nums == null || nums.length < k) {
            return null;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(k,
                (a, b) -> getFirstComparison(a, b));
        for (String s : nums) {
            int curNum = Integer.parseInt(s);
            if (pq.size() < k) {
                pq.offer(curNum);
            } else {
                if (getFirstComparison(curNum, pq.peek()) >= 0) {
                    pq.poll();
                    pq.offer(curNum);
                }
            }
        }
        return Integer.toString(pq.poll());
    }

    private static int getFirstComparison(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int i = 0;
        while (i < strA.length() || i < strB.length()) {
            char aChar = i < strA.length() ? strA.charAt(i) : strA.charAt(0);
            char bChar = i < strB.length() ? strB.charAt(i) : strB.charAt(0);
            if (aChar < bChar) {
                return 1;
            } else if (aChar > bChar) {
                return -1;
            } else {
                i++;
            }
        }
        return 0;
    }
    
}