package com.codex;

import java.util.*;

public class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int x: answers) counts.put(x, counts.getOrDefault(x, 0) + 1);
        int ans = 0;
        for (int x: counts.keySet()) {
            int rabbits = (x+1);
            ans += rabbits * ((counts.get(x) + x) / (x+1));
        }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }

        return sb.toString();

    }

    
}