package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;
public class Main {
	private static final long MOD = 998244353;
	private long sum;
	private long mul;
	private long sum1;
	private long mul1;
	private long N;
	private long K;
	
	
    public long power(long x, long y) {
        if (y == 0)
            return 1;
        long p = power(x, y / 2) % MOD;
        p = (p * p) % MOD;
        return (y % 2 == 0) ? p : (x * p) % MOD;
    }
 
    public long modInverse(long n) {
        return power(n, MOD - 2);
    }
 
 
    void findSumMul(long N, long K) {
        sum1 = (N * (N + 1)) / 2;
        mul1 = N;
        long den = modInverse(sum1);
        sum = sum1;
        mul = mul1;
        for (long i = 0; i < K - 1; i++) {
            long tempSum = sum;
            long tempMul = mul;
 
            sum = (sum * sum1 + tempMul * mul1)%MOD;
            mul = (tempSum * mul1 + tempMul * sum1)%MOD;
 
            sum = (sum * den) % MOD;
            mul = (mul * den) % MOD;
        }
    }
 
    public void input() {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            N = s.nextInt();
            K = s.nextInt();
            findSumMul(N, K);
            long ans=((sum*mul)%MOD*(mul+sum)%MOD)%MOD;
            System.out.println(ans);
        }
    }
 
    public static void main(String[] args) {
        Main m = new Main();
        m.input();
    }
}
}