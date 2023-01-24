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
                if (getFirstComparison(curNum, pq.peek()) < 0) {
                    pq.poll();
                    pq.offer(curNum);
                }
            }
        }
        return Integer.toString(pq.poll());
    }

    private static int getFirstComparison(int a, int b) {
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        int lenA = aStr.length();
        int lenB = bStr.length();
        int i = 0;
        while (i < lenA || i < lenB) {
            if (i < lenA && i < lenB) {
                if (aStr.charAt(i) < bStr.charAt(i)) {
                    return 1;
                } else if (aStr.charAt(i) > bStr.charAt(i)) {
                    return -1;
                } else {
                    i++;
                }
            } else {
                if (i < lenA) {
                    if (aStr.charAt(i) < aStr.charAt(0)) {
                        return 1;
                    } else if (aStr.charAt(i) > aStr.charAt(0)) {
                        return -1;
                    } else {
                        i++;
                    }
                } else {
                    if (bStr.charAt(i) < bStr.charAt(0)) {
                        return -1;
                    } else if (bStr.charAt(i) > bStr.charAt(0)) {
                        return 1;
                    } else {
                        i++;
                    }
                }
            }
        }
        return 0;
    }
    
}