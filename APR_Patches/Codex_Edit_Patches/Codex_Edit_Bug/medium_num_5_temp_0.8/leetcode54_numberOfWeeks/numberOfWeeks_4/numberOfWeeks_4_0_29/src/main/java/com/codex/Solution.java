package com.codex;

import java.util.*;

public class Solution {
public static long numberOfWeeks(int[] milestones) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		for (int i = 0; i < milestones.length; i++) {
			list.add(milestones[i]);
		}
		Collections.sort(list);
		int[] dp = new int[list.size()];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = list.get(i);
		}

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) % list.get(i) == 0) {
					dp[j] = Math.max(dp[j], dp[i] + list.get(j));
				}
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < dp.length; i++) {
			max = Math.max(max, dp[i]);
		}
		return (max - 1) / 7 + 1;
	}
}