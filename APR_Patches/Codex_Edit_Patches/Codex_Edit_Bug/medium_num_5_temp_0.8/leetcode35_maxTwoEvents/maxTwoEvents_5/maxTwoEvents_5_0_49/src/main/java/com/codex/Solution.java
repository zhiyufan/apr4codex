package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] events = { {1,4,4},{4,4,5},{4,4,6},{1,1,1},{1,1,2},{2,2,2},{2,2,3}};
        System.out.println(maxTwoEvents(events));
        
    }
    
    public static int maxTwoEvents(int[][] events) {
        
        int[][] dp = new int[events.length + 1][events.length + 1];
        for (int i = 1; i <= events.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
            for (int j = 1; j <= events.length; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                int prevEndTime = (j == 1) ? -1: events[j-2][1];
                if (events[i-1][0] >= prevEndTime + 1) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + events[i-1][2]);
                }
            }
        }
        return Math.max(dp[events.length][events.length], dp[events.length][events.length - 1]);
    }
}

    
    
}