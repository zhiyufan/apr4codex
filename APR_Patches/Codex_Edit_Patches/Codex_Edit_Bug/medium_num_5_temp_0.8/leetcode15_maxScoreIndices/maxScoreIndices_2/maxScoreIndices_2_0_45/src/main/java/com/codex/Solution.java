package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<Integer> res = maxScoreIndices(new int[]{1, 1, 0, 0, 1, 1, 0, 1, 0});
        System.out.println(res);
    }

    public static List<Integer> maxScoreIndices(int[] nums) {

        int n = nums.length;
        if (n <= 1) return new ArrayList<>();
        int[] leftCount = new int[n]; leftCount[0] = nums[0];
        int[] rightCount = new int[n]; rightCount[n - 1] = nums[n - 1] ^ 1;
        int max = leftCount[0] + rightCount[n - 1];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            leftCount[i] = leftCount[i - 1] + nums[i];
            rightCount[n - i - 1] = rightCount[n - i] + (nums[n - i - 1] ^ 1);
            int sum = leftCount[i] + rightCount[n - i - 1];
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