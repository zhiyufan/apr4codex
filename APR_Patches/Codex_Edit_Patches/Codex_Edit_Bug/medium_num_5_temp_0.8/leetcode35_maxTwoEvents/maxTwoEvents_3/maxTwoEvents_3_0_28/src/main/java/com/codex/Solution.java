package com.codex;

import java.util.*;

public class Solution {
public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        int[] dp = new int[n];
        dp[0] = events[0][2];
        dp[1] = events[1][2];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], events[i][2] + dp[i - 2]);
        }
        return dp[n-1];
    }
    
    public int bestTimeToBuyAndSellStockWithCooldown(int[] prices) {
        
        int n = prices.length;
        if (n == 0) return 0;
        int buy[] = new int[n];
        int cooldown[] = new int[n];
        cooldown[0] = 0;
        buy[0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            buy[i] = Math.max(coolDown[i-1] - prices[i], buy[i-1]);
            cooldown[i] = Math.max(buy[i-1] + prices[i], cooldown[i-1]); 
        }
        return cooldown[n-1];
    }
    
    public int bestTimeToBuyAndSellStockWithTransactionFee(int[] prices, int fee) {
        
        if (prices.length == 0) return 0;
        int n = prices.length;
        int sell[] = new int[n];
        int hold[] = new int[n];
        sell[0] = 0;
        hold[0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            sell[i] = Math.max(sell[i-1], hold[i-1] + prices[i] - fee);
            hold[i] = Math.max(hold[i-1], sell[i-1] - prices[i]);
        }
        return sell[n-1];
    }
    
    public static int maxProduct(int[] nums) {
        
        int n = nums.length;
        int min[] = new int[n];
        int max[] = new int[n];
        min[0] = max[0] = nums[0];
        int ans = nums[0];
        for (int i = 1; i < n; i++) {
            
            if (nums[i] < 0) {
                int temp = max[i-1];
                max[i-1] = min[i-1];
                min[i-1] = temp;
            }
            max[i] = Math.max(nums[i], max[i-1]*nums[i]);
            min[i] = Math.min(nums[i], min[i-1]*nums[i]);
            ans = Math.max(ans, max[i]);
        }
        return ans;
    }
    
    public static int maxProfit(int[] prices) {
        
        int n = prices.length;
        int buy[] = new int[n];
        int sell[] = new int[n];
        buy[0] = -prices[0];
        for (int i = 1; i < n; i++) {
            
            buy[i] = Math.max(buy[i-1], sell[i-2] - prices[i]);
            sell[i] = Math.max(sell[i-1], prices[i] + buy[i-1]);
        }
        return sell[n-1];
    }
    
    public static int maxProfit(int[] prices, int fee) {
        
        int n = prices.length;
        int buy[] = new int[n];
        int sell[] = new int[n];
        buy[0] = -prices[0];
        for (int i = 1; i < n; i++) {
            buy[i] = Math.max(buy[i-1], sell[i-1] - prices[i]);
            sell[i] = Math.max(sell[i-1], prices[i] + buy[i-1] - fee);
        }
        return sell[n-1];
    }
    
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
        int n = stations.length;
        int[] dp = new int[n+1];
        dp[0] = startFuel;
        for (int i = 0; i < n; i++) {
            
            for (int j = i; j >= 0; j--) {
                
                if (dp[j] >= stations[i][0]) {
                    dp[j+1] = Math.max(dp[j+1], dp[j] + stations[i][1]);
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            
            if (dp[i] >= target) return i;
        }
        return -1;
    }
    
    public int minRefuelStopsSmart(int target, int startFuel, int[][] stations) {
        
        int n = stations.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int ans = 0;
        int fuel = startFuel;
        int i = 0;
        while (true) {
            
            while (i < n && fuel >= stations[i][0]) {
                pq.offer(stations[i][1]);
                i++;
            }
            if (fuel >= target) return ans;
            if (pq.isEmpty()) return -1;
            fuel += pq.poll();
            ans++;
        }
    }
    
    public boolean canPartition(int[] nums) {
        
        int n = nums.length, sum = 0;
        for (int i = 0; i < n; i++) sum += nums[i];
        if (sum % 2 != 0) return false;
        
        sum /= 2;
        boolean[][] dp = new boolean[n+1][sum + 1];
        
        for (int i = 0; i <= n; i++) dp[i][0] = true;
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= sum; j++) {
                
                if (j >= nums[i-1]) {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    
    public int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        int[] dp = new int[n];
        dp[0] = events[0][2];
        dp[1] = events[1][2];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], events[i][2] + dp[i - 2]);
        }
        return dp[n-1];
    }

    
}