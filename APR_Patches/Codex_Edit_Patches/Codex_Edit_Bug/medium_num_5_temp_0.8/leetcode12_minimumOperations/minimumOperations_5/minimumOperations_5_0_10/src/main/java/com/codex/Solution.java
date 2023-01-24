package com.codex;

import java.util.*;

public class Solution {
    public static int[] shortestToChar(String S, char C) {
        
        int n = S.length();
        int[] ans = new int[n];
        int pos = -n;
        for(int i = 0; i < n; i++){
            if(S.charAt(i) == C){
                pos = i;
            }
        }
        return dp[n - 1];
    }

    
}