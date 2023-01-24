package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        int n = nums.length;
        int max = 0;
        List<Integer> ans = new ArrayList<Integer>();
        List<Integer> ones = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) ones.add(i);
        }
        int lo = 0;
        int hi = ones.size() - 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) count++;
        }
        int leftCount = count;
        int rightCount = 0;
        for (int i = 0; i < ones.size(); i++) {
            leftCount = leftCount - (ones.get(i) - lo);
            rightCount = rightCount + (hi - ones.get(i));
            if (leftCount + rightCount > max) {
                max = leftCount + rightCount;
                ans.clear();
                ans.add(ones.get(i));
            } else if (leftCount + rightCount == max) {
                ans.add(ones.get(i));
            }
            lo++;
            hi--;
        }
        return ans;
    }
    
    // TLE in some test cases.
    public static List<Integer> maxScoreIndices(int[] nums) {
        
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) count++;
            left[i] = count;
        }
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == 0) count++;
            right[i] = count;
        }
        List<Integer> ans = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (left[i] + right[i] > max) {
                ans.clear();
                ans.add(i);
                max = left[i] + right[i];
            } else if (left[i] + right[i] == max) {
                ans.add(i);
            }
        }
        return ans;
    }
    
}