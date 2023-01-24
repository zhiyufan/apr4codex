package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int[] dp = new int[s.length()+1];
        char[] sChar = s.toCharArray();
        if (sChar.length == 0) {
            return 0;
        }
        dp[1] = dp[0];
        for (int i = 2; i < sChar.length+1; i++) {
            if (sChar[i] == sChar[i-1] && sChar[i-1] == sChar[i-2]) {
                dp[i] = sChar[i-1] == 'X'? 0 : 1;
            } else if (sChar[i] == sChar[i-1] && sChar[i-1] != sChar[i-2]) {
                dp[i] = sChar[i-1] == 'X'? 1 : 0;
            } else {
                dp[i] = 0;
            }
            dp[i] += dp[i-1];
        }
        return dp[dp.length-1];
    }


    public static void main(String args[]) {
        int result = minimumMoves("RBRRB");
        System.out.println(result);
    }
}