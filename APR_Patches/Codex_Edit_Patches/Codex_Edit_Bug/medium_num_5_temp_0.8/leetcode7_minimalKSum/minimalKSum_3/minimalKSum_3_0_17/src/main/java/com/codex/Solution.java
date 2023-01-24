package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int maximalSquare(char[][] matrix) {
        int res = 0;
        if(matrix == null || matrix.length == 0){
            return res;
        }
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(i == 0 || j == 0){
                    if(matrix[i][j] == '1'){
                        dp[i][j] = 1;
                    }
                } else{
                    if(matrix[i][j] == '1'){
                        if(dp[i - 1][j - 1] != 0){
                            int l = dp[i - 1][j - 1];
                            boolean flag = true;
                            for(int k = 1 ; k <= l ; k++){
                                if(dp[i][j - k] == 0 || dp[i - k][j] == 0){
                                    flag = false;
                                    break;
                                }
                            }
                            if(flag){
                                dp[i][j] = l + 1;
                            } else{
                                dp[i][j] = l;
                            }
                        } else{
                            dp[i][j] = 1;
                        }
                    }
                }
                res = Math.max(dp[i][j],res);
            }
        }
        return res * res;
    }
}
}