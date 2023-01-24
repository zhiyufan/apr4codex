package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] a, int k) {
        if (k == 0) {
            throw new IllegalArgumentException();
        }
        if (k > a.length) {
            throw new IllegalArgumentException();
        }
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException();
        }
        for (String s : a) {
            if (s == null || s.length() == 0) {
                throw new IllegalArgumentException();
            }
        }
        
        PriorityQueue<String> pq = new PriorityQueue<>(k, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        for (String s : a) {
            pq.offer(s);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return String.join("", res);
    }

    
}