package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i] + 1)) {
                count += 1;
            }
        }
        return count;
    }
        public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if(prices[i] < prices[i + 1]) {
                profit += (prices[i + 1] - prices[i]);
            }
        }
        return profit;
    }

    
    
}