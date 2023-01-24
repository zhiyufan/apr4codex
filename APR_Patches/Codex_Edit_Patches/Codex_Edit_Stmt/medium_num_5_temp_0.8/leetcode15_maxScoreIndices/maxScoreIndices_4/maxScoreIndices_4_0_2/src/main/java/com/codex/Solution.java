package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 0, 1, 1, 0};
        System.out.println(maxScoreIndices(nums));
    }

    public static List<Integer> maxScoreIndices(int[] nums) {

        int max = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int[] left = Arrays.copyOfRange(nums, 0, i-1);
            int[] right = Arrays.copyOfRange(nums, i+1, nums.length);
            System.out.println(i);
            System.out.println(Arrays.toString(left));
            System.out.println(Arrays.toString(right));
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