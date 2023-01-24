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
        while (i < lenA && i < lenB) {
            if (strA.charAt(i) < strB.charAt(i)) {
                return 1;
            } else if (strA.charAt(i) > strB.charAt(i)) {
                return -1;
            } else {
                i++;
            }
        }
        
        for (; i < lenA; i++) {
            int cur = strA.charAt(i) - '0';
            int head = strA.charAt(0) - '0';
            if (cur < head) {
                return 1;
            } else if (cur > head) {
                return -1;
            }
        }
        
        for (; i < lenB; i++) {
            int cur = strB.charAt(i) - '0';
            int head = strB.charAt(0) - '0';
            if (cur < head) {
                return -1;
            } else if (cur > head) {
                return 1;
            }
        }
        
        // return strA.length() > strB.length() ? 1 : -1;
        if (lenA > lenB) {
            return 1;
        } else if (lenA < lenB) {
            return -1;
        } else {
            if (strA.charAt(0) <= strB.charAt(0)) {
                return 1;
            } else if (strB.charAt(0) < strA.charAt(0)) {
                return -1;
            } else {
                return 0;
            }
        }
    }
    
    
    public static String kthLargestNumber2(String[] nums, int k) {
        
        if (nums == null || nums.length < k) {
            return null;
        }
        PriorityQueue<String> pq = new PriorityQueue<>(k,
                (a, b) -> getFirstComparison(a, b));
        for (String s : nums) {
            if (pq.size() < k) {
                pq.offer(s);
            } else {
                if (getFirstComparison(s, pq.peek()) >= 0) {
                    pq.poll();
                    pq.offer(s);
                }
            }
        }
        return pq.poll();
    }
    
    private static int getFirstComparison(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int i = 0;
        while (i < lenA && i < lenB) {
            if (a.charAt(i) < b.charAt(i)) {
                return 1;
            } else if (a.charAt(i) > b.charAt(i)) {
                return -1;
            } else {
                i++;
            }
        }
        
        for (; i < lenA; i++) {
            int cur = a.charAt(i) - '0';
            int head = a.charAt(0) - '0';
            if (cur < head) {
                return 1;
            } else if (cur > head) {
                return -1;
            }
        }
        
        for (; i < lenB; i++) {
            int cur = b.charAt(i) - '0';
            int head = b.charAt(0) - '0';
            if (cur < head) {
                return -1;
            } else if (cur > head) {
                return 1;
            }
        }
        
        // return strA.length() > strB.length() ? 1 : -1;
        if (lenA > lenB) {
            return 1;
        } else if (lenA < lenB) {
            return -1;
        } else {
            if (a.charAt(0) <= b.charAt(0)) {
                return 1;
            } else if (b.charAt(0) < a.charAt(0)) {
                return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}