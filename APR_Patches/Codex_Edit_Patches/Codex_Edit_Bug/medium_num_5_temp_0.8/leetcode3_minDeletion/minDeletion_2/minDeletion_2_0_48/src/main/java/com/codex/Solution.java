package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        


        int[] oddList = new int[nums.length];
        int[] evenList = new int[nums.length];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenList[evenIndex++] = nums[i];
            } else {
                oddList[oddIndex++] = nums[i];
            }
        }

        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (evenCount > 1) {
                    evenList[i - 1] = evenList[i];
                }
                evenCount = 0;
                if (i > 0 && evenList[i] == evenList[i - 1]) {
                    evenCount++;
                }
            } else {
                if (oddCount > 1) {
                    oddList[i - 1] = oddList[i];
                }
                oddCount = 0;
                if (i > 0 && oddList[i] == oddList[i - 1]) {
                    oddCount++;
                }

            }
        }

        int[] result = new int[nums.length];
        int resultIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[resultIndex++] = evenList[i];
            } else {
                result[resultIndex++] = oddList[i];
            }
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != result[i]) {
                count++;
            }
        }

        return count;
    }

         
        public int minSwapsToMakePalindrome(String s) {

        // Generate all possible palindromes by swapping
        // Check if any palindrome exists
        
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        
        for (int i = 1; i < n; i++) {
            int j = i + 1;
            if (s.charAt(i) == s.charAt(j)) {
                dp[i][j] = 2;
            } else {
                dp[i][j] = 0;
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i+1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
            
            if (dp[0][i] == i + 1) {
                count++;
            }
        }

        return count;
    }
}