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


 public static List<Integer> maxScoreIndices(int[] nums) {


        boolean[] left = new boolean[nums.length];
        boolean[] right = new boolean[nums.length];
        int ones = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ones++;
            }
        }
        right[nums.length - 1] = ones > 0;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i + 1] == 1) {
                ones--;
            }
            right[i] = ones > 0;
        }

        ones = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                ones++;
            }
            left[i] = ones > 0;
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (left[i] && right[i]) {
                ans.add(i);
            }
        }
        return ans;
    }

}