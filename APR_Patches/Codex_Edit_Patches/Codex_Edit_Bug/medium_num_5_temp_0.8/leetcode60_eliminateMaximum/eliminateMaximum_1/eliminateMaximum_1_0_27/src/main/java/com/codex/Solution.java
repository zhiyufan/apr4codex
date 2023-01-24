package com.codex;

import java.util.*;

public class Solution {

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        if(n <= 1) return 0;
        int buy1 = INT_MIN, sell1 = 0;
        int buy2 = INT_MIN, sell2 = 0;
        for(int i = 0; i < prices.size(); i++) {
            buy1 = max(buy1, -prices[i]);
            sell1 = max(sell1, buy1 + prices[i]);
            buy2 = max(buy2, sell1 - prices[i]);
            sell2 = max(sell2, buy2 + prices[i]);
        }
        Arrays.sort(time);
        int maxIndex = 0;
        for(int i = 0; i < time.length; i++) {
            if(time[i] < 0) {
                maxIndex++;
            }
        }
        return maxIndex;
    }

    
}