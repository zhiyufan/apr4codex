package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < dist.length; i++) {
            pq.add(dist[i] * speed[i]);
        }
        int count = 0;
        int charge = 0;
        while (!pq.isEmpty()) {
            charge += pq.poll();
            count++;
            if (charge < 0) {
                break;
            }
        }
        return count;
    }

    
    
    
    public static String compress(String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word.length()) {
            int j = i + 1;
            while (j < word.length() && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            result.append(word.charAt(i));
            result.append(j - i);
            i = j;
        }
        return result.length() >= word.length() ? word : result.toString();
    }
    
}