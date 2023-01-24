package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Leetcode1047 {
    public static int minimumMoves(String s) {
        
        int[] dp = new int[s.length()+1];
        char[] sChar = (s+"X").toCharArray();
        if (sChar[0] == sChar[1] && sChar[1] != sChar[2]) {
            dp[0] = 1;
        }
        else if (sChar[0] == sChar[1] && sChar[1] == sChar[2]) {
            dp[0] = 0;
        } else {
            dp[0] = 100;
        }
        dp[1] = dp[0];
        for (int i = 2; i < sChar.length-1; i++) {
            dp[i] = dp[i-1];
            
            if (sChar[i] == sChar[i-1] && sChar[i] != sChar[i-2]) {
                dp[i] = Math.min(dp[i], dp[i-2] + 1);
            } else if (sChar[i] == sChar[i-1] && sChar[i] == sChar[i-2]) {
                dp[i] = Math.min(dp[i], dp[i-2]);
            } else {
                dp[i] = Math.min(dp[i], dp[i-2] + 2);
            }
        }
        return dp[dp.length-2];
    }
    public static void main(String[] args) {
        System.out.println(minimumMoves("LLRRLLRRLL"));
    }
}

    
}