package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
        for (String s : nums) {
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



public static Double average(int[] inputs) {
        if (inputs == null || inputs.length == 0) {
            return 0.0;
        }
        int len = inputs.length;
        double sum = 0.0;
        for (int i = 0; i < len; ++i) {
            sum += inputs[i];
        }
        return sum / len;
    }

    
}