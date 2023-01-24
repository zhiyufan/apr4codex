package com.codex;

import java.util.*;

public class Solution {
   public class UnboundedKnapsack {

	public static int unboundedKnapsack(int[] W, int[] V, int C) {

		int[] value = new int[C + 1];
		int n = W.length;
		for (int i = 0; i <= C; i++) {
			for (int j = 0; j < n; j++) {
				if (W[j] <= i) {
					value[i] = Math.max(value[i], V[j] + value[i - W[j]]);
				}
			}
		}
		return value[C];
	}

	public static void main(String[] args) {

		int W[] = {2, 3, 4};
		int V[] = {5, 7, 2};
		int C = 5;
		System.out.println(unboundedKnapsack(W, V, C));
	}

}
}