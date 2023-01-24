package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                count++;
            }

            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                count++;
            }
    public int[] getGames(int n) {
        if (n == 0) {
            return new int[]{};
        } else if (n == 1) {
            return new int[]{1};
        } else if (n == 2) {
            return new int[]{1, 2};
        }

        int[] temp = new int[n];
        temp[0] = 1;
        temp[1] = 2;

        for (int i = 2; i < n; i++) {
            temp[i] = temp[i - 1] + temp[i - 2];
        }
        return temp;
    }

    public int getMostMoney(int n) {
        if (n <= 2) {
            return n;
        } else {
            return getMostMoney(n - 2) + getMostMoney(n - 3);
        }
    }

    

    public int findSubSequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int res = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (a == arr[j] + arr[k]) {
                        temp = 1 + Math.max(findSubSequence(Arrays.copyOfRange(arr, 0, j)),
                                            findSubSequence(Arrays.copyOfRange(arr, j + 1, k)));
                        res = Math.max(res, temp);
                    }
                }
            }
        }
        return res;
    }

    

    public int numOfCoins(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        if (arr.length == 1) {
            return arr[0];
        }

        int[] dp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            dp[i + 1] = num + dp[i];
            for (int j = i - 1; j >= 0; j--) {
                num += arr[j];
                dp[i + 1] = Math.max(dp[i + 1], num + dp[j]);
            }
        }
        return dp[arr.length];
    }

    public static int countHillValley(int[] nums) {
        if (nums == null || nums.length < 3) {
            return 0;
        }

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                count++;
            }

            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    

    public static int maxSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        int[] dp = new int[col + 1];

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                dp[j] = Math.max(dp[j - 1], dp[j]) + matrix[i - 1][j - 1];
            }
        }
        return dp[col];
    }
        }
        return count;
    }

    
}