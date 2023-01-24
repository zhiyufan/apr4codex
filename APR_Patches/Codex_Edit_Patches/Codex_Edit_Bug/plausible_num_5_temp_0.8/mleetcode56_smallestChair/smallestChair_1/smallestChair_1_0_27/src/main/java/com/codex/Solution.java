package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public static int getMaxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0)
            return 0;

        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        int maxSoFar = 0;
        int maxLeftIndex = 0;

        for (int i = 0; i < n; i++) {
            if (prices[i] > maxSoFar) {
                maxSoFar = prices[i];
                maxLeftIndex = i;
            }
            maxLeft[i] = maxLeftIndex;
        }

        int minSoFar = Integer.MAX_VALUE;
        int minRightIndex = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (prices[i] < minSoFar) {
                minSoFar = prices[i];
                minRightIndex = i;
            }
            maxRight[i] = minRightIndex;
        }

        int maximumProfit = 0;

        for (int i = 0; i < n; i++) {
            int previousBestBuy = prices[maxLeft[i]];
            int followingBestSell = prices[maxRight[i]];
            maximumProfit = Math.max(maximumProfit, followingBestSell - previousBestBuy);
        }


        return maximumProfit;
    }
}
}