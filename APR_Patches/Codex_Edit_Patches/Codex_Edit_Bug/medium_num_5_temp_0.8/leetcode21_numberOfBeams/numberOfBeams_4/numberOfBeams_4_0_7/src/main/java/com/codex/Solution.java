package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        int[][] dp = new int[bank.length][bank[0].length()];
        int beams = 0;
        for(int i = 0; i < bank.length; ++i){
            for(int j = 0; j < bank[i].length(); ++j){
                dp[i][j] = bank[i].charAt(j) == '1' ? 1 : 0;
            }
        }
        for(int j = 0; j < bank[0].length(); ++j){
            for(int i = 0; i < bank.length; ++i){
                if(dp[0][0] == 1){
                    for(int k = i + 1; k < bank.length; ++k){
                        beams += (dp[k][j] * dp[i][j]);
                        if(dp[k][j] == 1){
                            beams -= 1;
                        }
                    }
                }
            }
        }
        return beams;
    }

    private static boolean checkBeam(String[] bank, int i, int k, int j){
        for(int w = i + 1; w < k; ++w){
            if(bank[w].charAt(j) == '0'){
                return false;
            }
        }
        return true;
    }

    
}