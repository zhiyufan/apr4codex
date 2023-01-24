package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] x = {0, 1, 0};
        System.out.println(maxScoreIndices(x));
        int[] y = {1, 1, 1, 0};
        System.out.println(maxScoreIndices(y));
        int[] z = {0, 1, 1, 0};
        System.out.println(maxScoreIndices(z));
    }

    // Complete the maxScoreIndices function below.
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

    
}