package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {


        int res = 0;
        for (int i = 1; i < word.length(); i++) {
            res += Math.min(move(word.charAt(i - 1), word.charAt(i)), 26 - move(word.charAt(i - 1), word.charAt(i)));
        }
        return res;
    }

    private static int move(char c1, char c2) {
        int num1 = c1 - 'a';
        int num2 = c2 - 'a';
        return Math.abs(num1 - num2);
    }

    /**
     *
     * @param word1 word1
     * @param word2 word1
     * @return
     */
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0] = i;
        }
        for(int j=0;j<=n;j++){
            dp[0][j] = j;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
                }
            }
        }

        return dp[m][n];


        /**
         * 
         * 
         * 
         * 
         * 
         * @param word1 word1
         * @param word2 word2
         * @return
         */
        public static int numJewelsInStones(String J, String S) {
            if (J == null || J.length() == 0 || S == null || S.length() == 0) return 0;
            Map<Character, Integer> map = new HashMap<>();
            int sum = 0;
            for (int i = 0; i < S.length(); i++) {
                map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
            }
            for (int i = 0; i < J.length(); i++) {
                if (map.get(J.charAt(i)) != null) {
                    sum += map.get(J.charAt(i));
                }
            }
            return sum;
        }
    }























    
}