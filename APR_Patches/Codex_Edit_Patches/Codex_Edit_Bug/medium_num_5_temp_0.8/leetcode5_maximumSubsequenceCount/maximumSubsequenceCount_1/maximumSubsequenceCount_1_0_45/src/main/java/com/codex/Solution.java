package com.codex;

import java.util.*;

public class Solution {
public class Main {

    public static void main(String[] args) {
        System.out.println(maximumSubsequenceCount("abcdddddef", "abc"));
        System.out.println(maximumSubsequenceCount("abcdddddef", "abcda"));
        System.out.println(maximumSubsequenceCount("abcdddddef", "cdef"));
        System.out.println(maximumSubsequenceCount("abcdddddef", "a"));
        System.out.println(maximumSubsequenceCount("abcdddddef", "g"));
        System.out.println(maximumSubsequenceCount("abcdddddef", "abcdef"));
        System.out.println(maximumSubsequenceCount("abcdddddef", "def"));
    }

    public static long maximumSubsequenceCount(String text, String pattern)
    {
        int[][] dp = new int[text.length() + 1][pattern.length() + 1];
        for (int i = 0; i < text.length(); i++)
        {
            dp[i][0] = 0;
        }
        
        dp[0][0] = 0;
        
        for (int i = 1; i <= text.length(); i++)
        {
            for (int j = 1; j <= pattern.length(); j++)
            {
                if (text.charAt(i - 1) == pattern.charAt(j - 1))
                {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else
                {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        
        return dp[text.length()][pattern.length()];    
    }

    
}