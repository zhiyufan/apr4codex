package com.codex;

import java.util.*;

public class Solution {
    public static int maxScoreIndices(int[] nums) {
        

        int max = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int[] left = Arrays.copyOfRange(nums, 0, i);
            int[] right = Arrays.copyOfRange(nums, i, nums.length);
            int score = 0;
            for (int n : left) {
                if (n == 0) {
                    score++;
                }
            }
            for (int n : right) {
                if (n == 1) {
                    score++;
                }
            }
            if (score > max) {
                max = score;
                
                ans = i;
            } else if (score == max) {
                ans = i;
            }
        }
        return ans;
    }

    
}