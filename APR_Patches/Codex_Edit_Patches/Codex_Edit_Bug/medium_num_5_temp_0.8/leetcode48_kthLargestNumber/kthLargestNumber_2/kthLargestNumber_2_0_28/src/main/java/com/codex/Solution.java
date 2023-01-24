package com.codex;

import java.util.*;

public class Solution {
    public static String largestNumber(String[] nums) {
        
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> (b + a).compareTo(a + b));
        for (String s : nums) {
            pq.offer(s);
        }  
        StringBuilder sb = new StringBuilder();
        for (String s : pq) {
            sb.append(s);
        }      
        return sb.toString();
    }

    
}