package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {   

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = nums[0] == 0 ? 1 : 0;
        right[nums.length-1] = nums[nums.length-1] == 1 ? 1 : 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                left[i] = left[i-1] + 1;
            } else {
                left[i] = left[i-1];
            }
        }
        for (int i = nums.length-2; i >= 0; i--) {
            if (nums[i] == 1) {
                right[i] = right[i+1] + 1;
            } else {
                right[i] = right[i+1];
            }
        }
        int max = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int score = left[i] + right[i];
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