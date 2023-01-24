package com.codex;

import java.util.*;

public class Solution {
// What is the problem?
// Given an array of 0s and 1s, where 0 means that the element is black
// and 1 means that the element is white.
// Find the indices of the element such that it maximizes the number
// of black elements on its left and right.
// For example, if the array = [1,0,0,1,0,0,1,1,1,0]
// Then indices 4 and 6 is the answer
// Because, removing either of these elements makes their left and right
// black element count equal to 3
// And it is the maximum possible for any elements


    public static List<Integer> maxScoreIndices(int[] nums) {
        
        int n = nums.length;
        if (n == 0) return new ArrayList<>();
        int[] leftCount = new int[n];
        int[] rightCount = new int[n];
        int cur = 0;
        for (int i = 0; i < n; i++) {
            cur += nums[i];
            leftCount[i] = cur;
        }
        cur = 0;
        for (int i = n - 1; i >= 0; i--) {
            cur += nums[i] ^ 1;
            rightCount[i] = cur;
        }
        int max = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int left = i == 0 ? 0 : leftCount[i - 1];
            int right = i == n - 1 ? 0 : rightCount[i + 1];
            int sum = left + right;
            if (sum > max) {
                max = sum;
                res = new ArrayList<>();
                res.add(i);
            } else if (sum == max) {
                res.add(i);
            }
        }
        return res;
    }

    
}