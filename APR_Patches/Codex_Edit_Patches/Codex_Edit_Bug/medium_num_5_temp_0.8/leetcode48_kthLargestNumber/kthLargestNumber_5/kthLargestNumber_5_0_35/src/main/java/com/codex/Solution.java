package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        if (nums == null || nums.length < k) {
            return null;
        }
        PriorityQueue<String> pq = new PriorityQueue<>(k,
                (a, b) -> getFirstComparison(a, b));
        for (String curNum : nums) {
            if (pq.size() < k) {
                pq.offer(curNum);
            } else {
                if (getFirstComparison(curNum, pq.peek()) < 0) {
                    pq.poll();
                    pq.offer(curNum);
                }
            }
        }
        return pq.poll();
    }

    private static int getFirstComparison(String strA, String strB) {
        int lenA = strA.length();
        int lenB = strB.length();
        int i = 0;
        while (i < lenA || i < lenB) {
            if (i < lenA && i < lenB) {
                if (strA.charAt(i) > strB.charAt(i)) {
                    return 1;
                } else if (strA.charAt(i) < strB.charAt(i)) {
                    return -1;
                } else {
                    i++;
                }
            } else {
                if (i < lenA) {
                    if (strA.charAt(i) > strA.charAt(0)) {
                        return 1;
                    } else if (strA.charAt(i) < strA.charAt(0)) {
                        return -1;
                    } else {
                        i++;
                    }
                } else {
                    if (strB.charAt(i) > strB.charAt(0)) {
                        return -1;
                    } else if (strB.charAt(i) < strB.charAt(0)) {
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