package com.codex;

import java.util.*;

public class Solution {

public class Solution {
    public int minimumCost(int[] costs) {
        
        if(costs.length == 0 || costs == null){
            return 0;
        }
        
        int[] dp = new int[cost.length + 1];
        
        dp[1] = costs[0];
        dp[2] = costs[1];
        
        for(int i = 3; i < dp.length; i++){
            dp[i] = Math.min(Math.min(dp[i - 1], dp[i - 2]) + costs[i - 1], dp[i - 3] + costs[i - 1]);
        }
        
        return dp[dp.length - 1];
    }

}
}