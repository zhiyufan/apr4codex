package com.codex;

import java.util.*;

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // initialize the array
        int[][] match =  new int[text1.length()+1][text2.length()+1];
        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                // if the char matches, take the maxLength of match up until now + 1
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    match[i][j] = match[i-1][j-1] + 1;
                } else {
                    // else take the max of these two lengths
                    match[i][j] = Math.max(match[i-1][j], match[i][j-1]);
                }
            }
        }

        while (k > 0) {
            int temp = 0;
            while (ans > 0) {
                temp += ans % 10;
                ans /= 10;
            }
            ans = temp;
            k--;
        }
        return ans;
    }
}