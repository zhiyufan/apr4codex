package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        

        int max = 0;
        List<Integer> ans = new ArrayList<>();
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
                ans.clear();
                ans.add(i);
            } else if (score == max) {
                ans.add(i);
            }
        }
        return ans;
    }

    // eller
    public static int maxScore(int[] nums) {
        int zeros = 0;
        int ones = 0;
        for (int i : nums) {
            if (i == 0) {
                zeros++;
            } else {
                ones++;
            }
        }
        int ans = 0;
        int leftZeros = 0;
        int rightOnes = ones;
        for (int n : nums) {
            if (n == 0) {
                leftZeros++;
            } else {
                rightOnes--;
            }
            int score = leftZeros + rightOnes;
            if (score > ans)
                ans = score;
        }
        return ans;
    }
}