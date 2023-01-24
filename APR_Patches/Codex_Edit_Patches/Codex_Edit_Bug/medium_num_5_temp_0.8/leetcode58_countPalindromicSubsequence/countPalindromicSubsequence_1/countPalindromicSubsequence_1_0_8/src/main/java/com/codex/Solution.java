package com.codex;

import java.util.*;

public class Solution {
package contest;



public class K_th_Smallest_in_Lexicographical_Order {

	public static int countPalindromicSubsequence(String s) {
        

		int[][] dp = new int[s.length()][s.length()];

		for (int i = s.length() - 1; i >= 0; i--) {
			for (int j = i; j < s.length(); j++) {
				if (i == j) {
					dp[i][j] = 1;
				} else if (s.charAt(i) == s.charAt(j)) {
					dp[i][j] = dp[i + 1][j - 1] + 2;
				} else {
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
				}
			}
		}

		return dp[0][s.length() - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findKthNumber(68824,25244));
	}

	public static int findKthNumber(int n, int k) {

		// int i = 1;
		// int res = 0;
		// while (i <= n) {
		// int r = k / i;
		// if (k % 2 == 0) {
		// res += r;
		// } else {
		// res += r + 1;
		// }
		// i *= i;
		// }

		int curr = 1;
		k = k - 1;
		while (k > 0) {
			int steps = calSteps(n, curr, curr + 1);
			if (steps <= k) {
				curr += 1;
				k -= steps;
			} else {
				curr *= 10;
				k -= 1;
			}
		}

		// System.out.println(curr);

		return curr;
	}

	// use long in case of overflow
	public static int calSteps(int n, long n1, long n2) {
		int steps = 0;
		while (n1 <= n) {
			steps += Math.min(n + 1, n2) - n1;
			n1 *= 10;
			n2 *= 10;
		}
		return steps;
    }

}
}