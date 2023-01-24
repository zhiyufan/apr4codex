package com.codex;

import java.util.*;

public class Solution {
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Scanner;

public class Main {

	public static int minStoneSum(int[] piles, int k) {
        

        int N = piles.length;
        int [][] dp = new int[N][k+1];
        int [] sum = new int[N];
        sum[0] = piles[0];
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i-1] + piles[i];
        }
        for (int i = 0; i < N; i++) {
            dp[i][0] = sum[i];
        }
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int m = 0; m < i; m++) {
                    int cur = Math.max(dp[m][j-1], sum[i] - sum[m]);
                    dp[i][j] = Math.min(dp[i][j], cur);
                }
            }
        }
        return dp[N-1][k];
    }
	
	public static void main(String[] args) throws IOException {
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new FileInputStream("input.txt"));
		
		int n = in.nextInt();
		int k = in.nextInt();
		int [] piles = new int [n];
		for (int i = 0; i < n; i++) {
			piles[i] = in.nextInt();
		}
		
		int ret = minStoneSum(piles, k);
		System.out.println(ret);
	}
}
}