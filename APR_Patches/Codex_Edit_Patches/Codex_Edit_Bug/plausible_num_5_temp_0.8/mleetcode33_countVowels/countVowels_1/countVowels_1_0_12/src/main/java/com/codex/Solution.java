package com.codex;

import java.util.*;

public class Solution {
    public static long countVowels(String word) {
        

        long count = 0;
        int cnt, len = word.length();
        char c;
        for (int i = 0; i < len; i++) {
            c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cnt = 1;
                for (int j = i + 1; j < len; j++) {
                    if (word.charAt(j) == c)
                        cnt++;
                    count += cnt;
                }
            }
        }
        return count;
    }

    
    int a[][];
    int count;
    public int countSquares(int[][] matrix) {
        a = matrix;
        count = 0;
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++){
                if(a[i][j]==1 && check(i,j))
                    count++;
            }
        return count;
    }
    
    
    public boolean check(int i,int j){
        if(a[i][j]!=1)
            return false;
        if(i==a.length-1 || j==a[0].length-1)
            return true;
        if(check(i+1,j) && check(i,j+1) && check(i+1,j+1))
            return true;
        return false;
    }
    
    
    
    
}