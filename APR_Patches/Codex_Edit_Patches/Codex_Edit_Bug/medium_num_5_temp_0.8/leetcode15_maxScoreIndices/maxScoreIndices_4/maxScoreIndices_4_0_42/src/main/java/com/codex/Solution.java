package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        

        int max = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int[] left = Arrays.copyOfRange(nums, 0, i);
            int[] right = Arrays.copyOfRange(nums, i, nums.length);
                System.out.print(n);
            int score = 0;
            for (int n : left) {
                if (n == 0) {
                    score++;
                }
                System.out.print(n);
            }
            for (int n : right) {
                if (n == 1) {
                    score++;
            System.out.println("");
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