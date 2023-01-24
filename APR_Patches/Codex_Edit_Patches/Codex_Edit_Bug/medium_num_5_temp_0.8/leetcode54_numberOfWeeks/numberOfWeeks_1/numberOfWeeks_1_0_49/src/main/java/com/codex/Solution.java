package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
class Solution {
    static int[] heights;
    static long[] dp;
    static PriorityQueue<Integer> pq;

    static long calcMin(int index) {
        
        int pqHead = pq.peek();
        if (heights[index] < dp[pqHead]) {
            dp[index] = dp[pqHead] + heights[index];
        } else {
            dp[index] = heights[index];
        }
        
        int pqLen = pq.size();
        for (int j = 0; j < pqLen; j++) {
            int prev = pq.remove();
            if (prev == pqHead) continue;
            if (heights[index] + dp[prev] < dp[pqHead]) {
                pq.add(prev);
                dp[index] = dp[prev] + heights[index];
                pq.add(index);
                break;
            }
        }
        return dp[index];
    }
    public static long numberOfWeeks(int[] milestones) { 
        heights = milestones;
        dp = new long[milestones.length];
        pq = new PriorityQueue<>();
        dp[0] = heights[0];
        pq.add(0);
        for (int i = 1; i < dp.length; i++) {
            calcMin(i);
        }
        return dp[dp.length - 1];
    }
    
        
    
}




























































































































































































































































































































































































































































































































































































        
        long[] dp = new long[milestones.length];
        int pqLen;
        dp[0] = milestones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        int pqHead, prev;
        for (long i = 1; i < dp.length; i++) {
            pqHead = pq.peek();
            if (milestones[(int) i] < dp[pqHead]) {
                dp[(int) i] = dp[pqHead] + milestones[(int) i];
            } else {
                dp[(int) i] = milestones[(int) i];
            }
            pqLen = pq.size();
            for (int j = 0; j < pqLen; j++) {
                prev = pq.remove();
                if (prev == pqHead) continue;
                if (milestones[(int) i] + dp[prev] < dp[pqHead]) {
                    pq.add(prev);
                    dp[(int) i] = dp[prev] + milestones[(int) i];
                    pq.add((int) i);
                    break;
                }
            }
        }
        return dp[dp.length - 1];
    }

}