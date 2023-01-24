package com.codex;

import java.util.*;

public class Solution {
  public int getKthSmallest(int[] array, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> getComparison(a, b));
        for (int i : array) {
            if (pq.size() == k) {
                if (getComparison(i, pq.peek()) <= 0) {
                    pq.poll();
                    pq.offer(i);
                }
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