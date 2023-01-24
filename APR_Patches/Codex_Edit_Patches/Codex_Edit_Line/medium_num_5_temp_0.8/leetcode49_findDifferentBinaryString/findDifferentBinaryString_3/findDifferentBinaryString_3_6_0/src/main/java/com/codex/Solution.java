package com.codex;

import java.util.*;

public class Solution {
    /**
     * @param nums an array of n numbers
     * @return the number that occurs more than n/2 times
     *    *
     *    * //pre: n > 0
     *
     *    * //post: return the number that occurs more than n/2 times
     *
     *    * //best case running time: Theta(n log n) where n is the length of the array
     *
     *    * //worst case running time: O(n^2) where n is the length of the array
     *
     *   
     */
    public static String findDifferentBinaryString(String[] nums) {
        
        int n = nums[0].length();
        char[][] char2D = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char2D[i][j] = nums[i].charAt(j);
            }
        }
        String s = "";
        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = 0; j < n; j++) {
                if (char2D[j][i] == '1') {
                    ones++;
                }
            }
            if (ones <= n / 2) {
                s += "0";
            } else {
                s += "1";
            }
        }
        return s;
    }

    
}