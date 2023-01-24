package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int[] dp = new int[s.length()];
        char[] sChar = s.toCharArray();
        if (sChar[0] == sChar[1] && sChar[1] == sChar[2]) {
            dp[0] = sChar[0] == 'X'? 0 : 1;
        }
        else if (sChar[0] == sChar[1] && sChar[1] != sChar[2]) {
            dp[0] = sChar[0] == 'X'? 1 : 0;
        } else {
            dp[0] = 0;
        }
        dp[1] = dp[0];
        for (int i = 2; i < sChar.length; i++) {
            if (sChar[i] == sChar[i-1] && sChar[i-1] == sChar[i-2]) {
                dp[i] = sChar[i] == 'X'? 0 : 1;
            } else if (sChar[i] == sChar[i-1] && sChar[i-1] != sChar[i-2]) {
                dp[i] = sChar[i] == 'X'? 1 : 0;
            } else { 
                int index = i-1;
                while (index >= 0 && sChar[index] == sChar[i]) {
                    index--;
                }
                if (sChar[index] != sChar[i]) {
                    index--;
                }
                
                if (sChar[index] == sChar[i]) {
                    dp[i] = 0;
                } else if (sChar[index] != sChar[i] && sChar[index+1] == sChar[i-1]) {
                    if (sChar[i] == 'X') {
                        dp[i] = dp[index];
                    } else {
                        dp[i] = dp[index] + 1;
                    }
                } else {
                    dp[i] = dp[index] + 2;
                }
                /*
                 * if (sChar[i] == 'X') {
                    dp[i]--;
                }
                dp[i] = 0;
                */
            }
            dp[i] += dp[i-1];
        }
        return dp[dp.length-1];
    }

    
}