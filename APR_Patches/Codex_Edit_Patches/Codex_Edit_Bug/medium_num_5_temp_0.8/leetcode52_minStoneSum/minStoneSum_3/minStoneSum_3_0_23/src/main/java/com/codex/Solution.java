package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class StoneGame {

	public boolean stoneGame(int[] piles) {
        

		int N = piles.length;
		int[][] dp = new int[N][N];
		for (int i = 0; i < N; i++)
			dp[i][i] = piles[i];

		for (int len = 2; len <= N; len++) {
			for (int i = 0; i <= N - len; i++) {
				int j = i + len - 1;
				dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println("");
		}
		return dp[0][N - 1] > 0;
    }

	public static void main(String[] args) {
		StoneGame sg = new StoneGame();
		int[] piles = { 5, 3, 4, 5 };
		System.out.println(sg.stoneGame(piles));
	}

}
}