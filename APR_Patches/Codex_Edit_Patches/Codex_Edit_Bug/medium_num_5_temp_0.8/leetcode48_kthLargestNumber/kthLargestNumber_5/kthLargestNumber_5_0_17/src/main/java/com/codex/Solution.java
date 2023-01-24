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
    
    public int minSwaps(String A, String B) {
        if (A == null || B == null || A.length() != B.length()) return -1;
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'Y' && b[i] == 'Y') count++;
            if (a[i] == 'N' && b[i] == 'Y') return -1;
        }
        int[] d = new int[count];
        int left = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'Y' && b[i] == 'Y') {
                d[left] = getDis(a, b, i);
                left++;
            }
        }
        return getMin(d);
    }
    
    private int getDis(char[] a, char[] b, int x) {
        for (int i = x; i < a.length; i++) {
            if (a[i] == 'N' && b[i] == 'N') {
                return i - x;
            }
        }
        return -1;
    }
    
    private int getMin(int[] d) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < d.length; i++) {
            int sum = 0;
            for (int j = 0; j < d.length; j++) {
                if (j != i) {
                    if (d[j] > d[i]) {
                        sum += d[j] - d[i];
                    } else {
                        sum += d[j];
                    }
                }
            }
            min = Math.min(min, sum);
        }
        return min;
    }
    
}