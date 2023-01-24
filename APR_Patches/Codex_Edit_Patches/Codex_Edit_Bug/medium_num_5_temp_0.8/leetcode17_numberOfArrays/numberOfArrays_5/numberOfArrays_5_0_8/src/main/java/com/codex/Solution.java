package com.codex;

import java.util.*;

public class Solution {
// Question link : https://leetcode.com/contest/weekly-contest-216/problems/count-sorted-vowel-strings/

/**
 * 
 */
    public static int countVowelStrings(int n) {
        

        int[][] matrix = new int[6][n];

        for (int i = 0; i < 6; i++) {
            matrix[i][0] = 1;
        }
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                int sum = 0;
                for (int k = j; k < 6; k++) {
                    sum += matrix[k][i-1];
                }
                matrix[j][i] = sum;
            }
        }

        return (int) dp[size - 1][1];
    }
}