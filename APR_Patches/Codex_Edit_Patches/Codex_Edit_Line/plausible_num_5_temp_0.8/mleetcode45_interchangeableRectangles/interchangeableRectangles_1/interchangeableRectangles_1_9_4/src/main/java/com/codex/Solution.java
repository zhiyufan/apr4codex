package com.codex;

import java.util.*;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int max = prices[prices.length - 1];
        int res = max - prices[0];
        for (int i = prices.length - 1; i > 0; i--) {
            max = Math.max(max, prices[i]);
            if (prices[i] < prices[i - 1]) {
                res = Math.max(res, max - prices[i - 1]);
            }
        }
        
        return res;
    }

    
}