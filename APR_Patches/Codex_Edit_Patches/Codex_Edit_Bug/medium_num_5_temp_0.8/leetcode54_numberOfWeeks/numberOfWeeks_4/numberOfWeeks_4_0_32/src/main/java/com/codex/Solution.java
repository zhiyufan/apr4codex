package com.codex;

import java.util.*;

public class Solution {
// { Driver Code Starts
import java.util.*;

class LongestCommonSubsequence {
    // Returns length of LCS for X[0..m-1], Y[0..n-1]

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();

            System.out.println(new LCS().lcs(s1, s2));
        }
    }
}// } Driver Code Ends

///////////////////////////////////////////////////////

class LCS {

    public static int lcs(String s1, String s2) {
        
        int m = s1.length();
        int n = s2.length();
        
        int[][] lcs = new int[m+1][n+1];
        
        for(int i = 0; i <=m; i++){
            for(int j = 0; j <=n; j++){
                
                if(i == 0 || j == 0){
                    lcs[i][j] = 0;
                }
                
                else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    lcs[i][j] = 1 + lcs[i-1][j-1];
                }
                
                else{
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }
        
        return lcs[m][n];
    }
    
   

}




/*
        
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < milestones.length; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < milestones.length; i++) {
            for (int j = i + 1; j < milestones.length; j++) {
                if (milestones[j] % milestones[i] == 0) {
                    list.get(i).add(j);
                }
            }
        }
        long[] dp = new long[milestones.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = milestones[i];
        }
        for (int i = 0; i < milestones.length; i++) {
            for (int j = i + 1; j < milestones.length; j++) {
                for(int k : list.get(i)) {
                    if(k == j) {
                        continue;
                    }
                    dp[j] = Math.max(dp[j], dp[i] + milestones[j]);
                }
            }
        }
        long max = Long.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return (max - 1) / 7 + 1;
    }*/
}