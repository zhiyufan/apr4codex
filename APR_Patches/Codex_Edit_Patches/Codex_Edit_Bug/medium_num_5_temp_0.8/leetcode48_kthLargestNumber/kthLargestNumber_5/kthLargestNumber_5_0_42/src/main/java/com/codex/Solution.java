package com.codex;

import java.util.*;

public class Solution {
public static String kthLargestNumber(String[] nums, int k) {
        
        if (nums == null || nums.length == 0 || k <= 0) {
            return null;
        }
        PriorityQueue<String> pq = new PriorityQueue<>(
                (a, b) -> (b + a).compareTo(a + b));
        for (String s : nums) {
            if (pq.size() < k) {
                pq.offer(s);
            } else {
                if ((s + pq.peek()).compareTo(pq.peek() + s) >= 0) {
                    pq.poll();
                    pq.offer(s);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            sb.append(pq.poll());
        }
        s = sb.toString();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (s.charAt(i) == '0' && i < j) {
                i++;
            }
            while (s.charAt(j) == '0' && i < j) {
                j--;
            }
            if (i < j) {
                if (s.charAt(i) < s.charAt(j)) {
                    return s.substring(i, j + 1);
                } else {
                    return s.substring(j, i + 1);
                }
            }
        }
        return s.substring(i, j + 1);
    }
    


}