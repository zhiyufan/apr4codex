package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;



    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        
        List<Integer> result = new ArrayList<>();
        if (security == null || security.length == 0 || time <= 0) return result;

        if (time == 1) {
            for (int i = 0; i < security.length - 1; i++) {
                if (security[i] >= security[i + 1]) result.add(i);
            }
            return result;
        }

        int end = security.length - time;
        for (int i = time; i <= end; i++) {
            int j = 0;
            for (j = 1; j <= time; j++) {
                if (!(security[i - j] >= security[i - j + 1] && security[i + j] <= security[i + j - 1])) break;
            }
            if (j > time) result.add(i);
        }
        return result;
    }

    public static int maxProfit(int K, int[] price) {

		if (K == 0 || price.length == 0) return 0;

		int[] k = new int[K];

		int current = 0, future = 1;
		while (current <= K) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < price.length; j++) {
				int temp = k[current];
				for (int i = 0; i < j; i++) {
					max = Math.max(max, k[current] + (price[j] - price[i]));
				}
				k[future] = Math.max(max, k[future]);
				temp = k[current];
			}
			current++;
			future++;
		}

		return k[K];
	}
}