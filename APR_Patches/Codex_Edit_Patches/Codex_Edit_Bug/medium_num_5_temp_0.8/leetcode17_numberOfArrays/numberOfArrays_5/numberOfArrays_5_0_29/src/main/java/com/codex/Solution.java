package com.codex;

import java.util.*;

public class Solution {
import java.util.*; 

class main{

    public static int numberOfArrays(int[] arr, int m, int k) {
        

        int size = arr.length + 1;
        long[][] dp = new long[size][2];
        dp[0][0] = 1;
        dp[0][1] = 0;

        for(int i = 1; i < size; i++) {
            int max = Math.min(m, arr[i - 1]);
            int min = Math.max(1, arr[i - 1]);
            dp[i][0] = dp[i - 1][1] + (dp[i][0] * max);
            dp[i][1] = dp[i - 1][0] + (dp[i][1] * min);
            if(max < 1 || min > m) {
                dp[i][1] = 0; 

    public static void main(String[] args) {
        System.out.println(numberOfArrays(new int[]{2,1,1},1,5));
    }
}
            }
        }

        return (int) dp[size - 1][0];
    }
}