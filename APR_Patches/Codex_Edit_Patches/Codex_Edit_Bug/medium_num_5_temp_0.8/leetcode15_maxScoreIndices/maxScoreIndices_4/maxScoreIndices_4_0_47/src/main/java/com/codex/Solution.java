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



        // better solution
        
        int max = 0;
        int zeros = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            }
            int score = zeros;
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] == 1) {
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
}