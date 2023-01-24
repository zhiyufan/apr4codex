package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        /** You are given an array of strings nums and an integer k. Each string in nums represents an integer without leading zeros.
         * Return the string that represents the kth largest integer in nums.
         * Note: Duplicate numbers should be counted distinctly. For example, if nums is ["1","2","2"], "2" is the first largest integer, "2" is the second-largest integer, and "1" is the third-largest integer.
         */
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
        int lenA = strA.length();
        int lenB = strB.length();
        int i = 0;
        while (i < lenA || i < lenB) {
            if (i < lenA && i < lenB) {
                if (strA.charAt(i) < strB.charAt(i)) {
                    return 1;
                } else if (strA.charAt(i) > strB.charAt(i)) {
                    return -1;
                } else {
                    i++;
                }
            } else {
                if (i < lenA) {
                    if (strA.charAt(i) < strA.charAt(0)) {
                        return 1;
                    } else if (strA.charAt(i) > strA.charAt(0)) {
                        return -1;
                    } else {
                        i++;
                    }
                } else {
                    if (strB.charAt(i) < strB.charAt(0)) {
                        return -1;
                    } else if (strB.charAt(i) > strB.charAt(0)) {
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