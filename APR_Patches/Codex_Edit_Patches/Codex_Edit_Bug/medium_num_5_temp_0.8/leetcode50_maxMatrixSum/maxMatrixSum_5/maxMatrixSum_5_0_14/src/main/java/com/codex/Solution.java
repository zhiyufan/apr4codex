package com.codex;

import java.util.*;

public class Solution {
public class AlternateSum {
 
    public boolean canAlternate(int[] a) {
        // Write your code here
        
        int n = a.length;
        int[] dp = new int[n+1];
        
        for(int i=1;i<=n;i++) {
            dp[i] = dp[i-1]+a[i-1];
        }
        
     
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(dp[j+1] - dp[i] == (j-i+1)/2) {
                    return true;
                }
            }
        }
        return false;
    }
}
}