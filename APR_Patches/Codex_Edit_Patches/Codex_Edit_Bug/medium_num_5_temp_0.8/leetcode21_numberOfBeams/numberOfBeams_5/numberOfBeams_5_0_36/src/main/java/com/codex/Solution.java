package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        

        int n = bank.length;
        int m = bank[0].length();
        int[] ones = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (bank[i].charAt(j) == '1') {
                    ones[i]++;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ones[i] > 1) {
                res += ones[i] * (ones[i] - 1) / 2;
            }

            for (int j = i + 1; j < n; j++) {
                if (ones[j] == 0) {
                    res += ones[i];
                }
            }
        }

        return res;
    }


    	public int maxProfit(int k, int[] prices) {
            
		int n = prices.length;
		if (k >= n / 2) {
			int[] array = Arrays.copyOf(prices, prices.length);
			Arrays.sort(array);
			return array[array.length - 1] - array[0];
		}
		
		int[] profit = new int[n];
		int[] prev_profit = new int[n];
		
		for (int step = 1; step <= k; step++) {
			for (int i = 1; i < n; i++) {
				prev_profit[i] = Math.max(prev_profit[i], profit[i - 1] + prices[i] - prices[i - 1]);
				profit[i] = Math.max(profit[i], prev_profit[i]);
			}
		}

	return profit[n - 1];

        }
}