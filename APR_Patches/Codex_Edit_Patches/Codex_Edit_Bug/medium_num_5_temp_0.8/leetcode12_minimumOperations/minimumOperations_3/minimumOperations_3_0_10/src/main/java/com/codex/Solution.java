package com.codex;

import java.util.*;

public class Solution {
public class Main {
public static void main(String[] args) {

        //int[] arr = {1,0,3,1,1,0,1};
        //int[] arr = {1,0,0,0,1,1,0,1};
        int[] arr = {0,0,1,0,1,0,0,1,1};
        System.out.println(minimumOperations(arr));
    }
    public static int minimumOperations(int[] arr) {
        
        if (arr == null || arr.length <= 1)
            return 0;
        
        int len = arr.length;
        int[][] dp = new int[len][3];
        dp[0][0] = arr[0] == 1 ? 1 : 0;
        dp[0][1] = Integer.MAX_VALUE / 2;
        dp[0][2] = Integer.MAX_VALUE / 2;
        
        dp[1][0] = dp[1][1] = 1;
        if (arr[0] == 0 && arr[1] == 1) {
            dp[1][0]++;
        }
        else if (arr[0] == 1 && arr[1] == 0) {
            dp[1][0]++;
        }
        for (int i = 2; i < len; i++) {
            dp[i][0] = dp[i-1][0] + (arr[i] == 0 ? 1 : 0);
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][1]) + (arr[i] == 1 ? 1 : 0);
            dp[i][2] = Math.min(dp[i-2][0], dp[i-2][1]) + (arr[i] == 0 ? 1 : 0);
            System.out.println(dp[i][0] + " " + dp[i][1] + " " + dp[i][2] + " ");
        }
        int result = Math.min(dp[len-1][0], dp[len-1][1]);
        result = Math.min(result, dp[len-1][2]);
        return result;
    }


    public static int minimumOperations1(int[] nums) {
        int len = nums.length;
        int[][] dp = new int[len][3];
        dp[0][0] = nums[0] == 1 ? 1 : 0;
        dp[0][1] = dp[0][2] = Integer.MAX_VALUE / 2;
        dp[1][0] = dp[1][1] = dp[1][2] = Integer.MAX_VALUE / 2;
        dp[1][0] = nums[1] == 0 ? 1 : 0;
        dp[1][1] = Math.min(dp[0][0], dp[0][2]) + (nums[1] == 1 ? 1 : 0);
        dp[1][2] = Math.min(dp[0][0], dp[0][1]) + (nums[1] == 0 ? 1 : 0);
        for (int i = 2; i < len; i++) {
            dp[i][0] = dp[i-1][0] + (nums[i] == 0 ? 1 : 0);
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + (nums[i] == 1 ? 1 : 0);
            dp[i][2] = Math.min(dp[i-1][1], dp[i-1][0]) + (nums[i] == 0 ? 1 : 0);
            /*
            for (int j = 0; j < 3; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();*/
        }

        int result = Math.min(dp[len-1][0], dp[len-1][1]);
        result = Math.min(result, dp[len-1][2]);
        return result;
    }


}


}