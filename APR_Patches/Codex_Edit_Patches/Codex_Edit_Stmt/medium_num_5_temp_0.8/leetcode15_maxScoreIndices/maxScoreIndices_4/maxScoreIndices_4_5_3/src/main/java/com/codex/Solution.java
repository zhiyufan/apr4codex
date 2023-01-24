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

    int max = 0;
    int count = 0;
    int left = 0, right = 0;
    for (int i = left; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            count++;
        }
        if (s.charAt(i) == ')') {
            count--;
        }
        if (count == 0) {
            if (left == right) {
                count = maxValidParenthesis(s.substring(left, right));
            } else {
                count = maxValidParenthesis(s.substring(left + 1, right));
            }
            max = Math.max(max, count);
            right++;
            left = right;
        } else if (count < 0) {
            left = right + 1;
            right = left;
            count = 0;
        } else {
            right++;
        }
    }
    return max;

    
}