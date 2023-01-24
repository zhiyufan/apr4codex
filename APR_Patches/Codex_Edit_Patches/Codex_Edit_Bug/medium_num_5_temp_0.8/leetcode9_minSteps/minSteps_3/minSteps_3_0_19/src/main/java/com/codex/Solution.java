package com.codex;

import java.util.*;

public class Solution {
    public static int maxProfit(int[] prices) {
        
        int profit = 0, minprice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            }
            if (prices[i] - minprice > profit) {
                profit = prices[i] - minprice;
            }
        }
        return profit;
    }

    
}