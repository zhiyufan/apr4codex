package com.codex;

import java.util.*;

public class Solution {
        for (int i = 0; i < n; i++) { 
            for (int j = i; j < n; j++) { 
                if (isPossible(c1, j)) {
                    dp[i][j] = 1;
                if (i == j || j == i + 1) {
                    dp[i][j] = -1;
                    continue;
                }
                dp[i][j] = -1;
                for (int k = i + 1; k < j; k++) {
                    if (dp[i][k] == 1 && dp[k][j] == 1) {
                        dp[i][j] = 1;
                        break;
                    }
                }
                if (dp[i][j] == 1) {
                    continue;
                }
                for (int k = j - 1; k >= i; k--) {
                    if (dp[k][j] == 1 && isPossible(c1, k)) {
                        dp[i][j] = 1;
                        break;
                    }
                }
                if (dp[i][j] == 1) {
                    continue;
                }
                for (int k = i + 1; k <= j; k++) {
                    if (dp[i][k] == 1 && isPossible(c2, k)) {
                        dp[i][j] = 1;
                        break;
                    }
                }
                if (dp[i][j] == 1) {
                    continue;
                }
                for (int k = j - 1; k >= i; k--) {
                    if (dp[k][j] == 1 && isPossible(c2, k)) {
                        dp[i][j] = 1;
                        break;
                    }
                }
                if (dp[i][j] == 1) {
                    continue;
                }
                for (int k = i; k <= j; k++) {
                    if (isPossible(c1, k) && isPossible(c2, k)) {
                        dp[i][j] = 1;
                        break;
                    }
                }
                if (dp[i][j] == 1) {
                    continue;
                }
                for (int k = j; k >= i; k--) {
                    if (isPossible(c1, k) && isPossible(c2, k)) {
                        dp[i][j] = 1;
                        break;
                    }
                }
                if (dp[i][j] == 1) {
                    continue;
                }
                for (int k = i + 1; k < j; k++) {
                    if (dp[i][k] == 1 && isPossible(c2, k)) {
                        dp[i][j] = 1;
                        break;
                    }
                }
                if (dp[i][j] == 1) {
                    continue;
                }
                for (int k = j - 1; k > i; k--) {
                    if (dp[k][j] == 1 && isPossible(c2, k)) {
                        dp[i][j] = 1;
                        break;
                    }
                }
                if (dp[i][j] == 1) {
                    continue;
                }
                for (int k = j; k >= i; k--) {
                    if (isPossible(c1, k) && dp[i][k] == 1) {
                        dp[i][j] = 1;
                        break;
                    }
                }
                if (dp[i][j] == 1) {
                    continue;
                }
                for (int k = i; k <= j; k++) {
                    if (isPossible(c2, k) && dp[k][j] == 1) {
                        dp[i][j] = 1;
                        break;
                    }
                }
                if (dp[i][j] == 1) {
                    continue;
                }
                for (int k = i; k < j; k++) {
                    if (dp[i][k] == 1 && dp[k][j] == 1) {
                        if (isPossible(c1, k) || isPossible(c2, k)) {
                            dp[i][j] = 1;
                            break;
                        }
                    }
                }
                if (dp[i][j] == 1) {
                    continue;
                }
                for (int k = j; k > i; k--) {
                    if (dp[i][k] == 1 && dp[k][j] == 1) {
                        if (isPossible(c1, k) || isPossible(c2, k)) {
                            dp[i][j] = 1;
                            break;
                        }
                    }
                }
                if (dp[i][j] == 1) {
                    continue;
                }
                for (int k = i + 1; k < j - 1; k++) {
                    if (dp[i][k] == 1 && isPossible(c2, k)) {
                        for (int l = j - 1; l > k; l--) {
                            if (dp[l][j] == 1 && isPossible(c1, l)) {
                                dp[i][j] = 1;
                                break;
                            }
                        }
                    }
                    if (dp[i][j] == 1) {
                        break;
                    }
                }
                if (dp[i][j] == 1) {
                    continue;
                }
                for (int k = j - 1; k > i + 1; k--) {
                    if (dp[k][j] == 1 && isPossible(c2, k)) {
                        for (int l = i + 1; l < k; l++) {
                            if (dp[i][l] == 1 && isPossible(c1, l)) {
                                dp[i][j] = 1;
                                break;
                            }
                        }
                    }
                    if (dp[i][j] == 1) {
                        break;
                    }
                }
                
                    continue;
                }
            }
        }
        return dp[0][n - 1];
    }   
    
}