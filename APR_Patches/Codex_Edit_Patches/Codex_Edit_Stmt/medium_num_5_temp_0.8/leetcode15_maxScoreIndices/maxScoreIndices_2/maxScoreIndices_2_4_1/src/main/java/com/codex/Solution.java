package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxScoreIndices(new int[]{1,0,1,0,1,1,1,0}));
        System.out.println(maxScoreIndices(new int[]{1,1,1,0,1,0,0,1,1,1,1}));
    }

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
        int max = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int left =  leftCount[i] - (i > 0 ? leftCount[i - 1] : 0);
            int right =  rightCount[i] - (i < n - 1 ? rightCount[i + 1] : 0);
            int sum = left + right;
            System.out.println(i + " left " + left + " right " + right + " sum " + sum);
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