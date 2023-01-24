package com.codex;

import java.util.*;

public class Solution {

    private static String kthLargestNumber(String[] nums, int k) {
        if (nums == null || nums.length < k) {
            return null;
        }
        PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> getComparison(a, b));
        for (String s : nums) {
            if (pq.size() < k) {
                pq.offer(s);
            } else {
                int comp = getComparison(s, pq.peek());
                if (comp >= 0) {
                    pq.poll();
                    pq.offer(s);
                }
            }
        }
        return pq.poll();
    }
    
    
    private static int getComparison(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int i = 0;
        int j = 0;
        while (i < lenA || j < lenB) {
            if (i < lenA && j < lenB) {
                if (a.charAt(i) < b.charAt(j)) {
                    return -1;
                } else if (a.charAt(i) > b.charAt(j)) {
                    return 1;
                } else {
                    i++;
                    j++;
                }
            } else {
                if (i < lenA) {
                    if (i == 0 || a.charAt(i) < a.charAt(0)) {
                        return 1;
                    } else if (a.charAt(i) > a.charAt(0)) {
                        return -1;
                    } else {
                        i++;
                    }
                } else {
                    if (j == 0 || b.charAt(j) < b.charAt(0)) {
                        return -1;
                    } else if (b.charAt(j) > b.charAt(0)) {
                        return 1;
                    } else {
                        j++;
                    }
                }
            }
        }
        return 0;
    }


    public static String kthLargestNumber(String[] nums, int k) {
        
        if (nums == null || nums.length < k) {
            return null;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(k,
                (a, b) -> getComparison(a, b));
        for (String num : nums) {
            int curNum = Integer.parseInt(num);
            if (pq.size() < k) {
                pq.offer(curNum);
            } else {
                if (getComparison(curNum, pq.peek()) >= 0) {
                    pq.poll();
                    pq.offer(curNum);
                }
            }
        }
        return Integer.toString(pq.poll());
    }

    private static int getComparison(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int lenA = strA.length();
        int lenB = strB.length();
        int i = 0;
        while (i < lenA || i < lenB) {
            if (i < lenA && j < lenB) {
                if (strA.charAt(i) < strB.charAt(i)) {
                    return 1;
                } else if (strA.charAt(i) > strB.charAt(i)) {
                    return -1;
                } else {
                    i++;
                }
            } else {
                if (j < lenB) {
                    if (strA.charAt(0) < strB.charAt(j)) {
                        return 1;
                    } else if (strA.charAt(0) > strB.charAt(j)) {
                        return -1;
                    } else {
                        j++;
                    }
                } else {
                    if (strA.charAt(i) < strA.charAt(0)) {
                        return -1;
                    } else if (strA.charAt(i) > strA.charAt(0)) {
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