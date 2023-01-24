package com.codex;

import java.util.*;

public class Solution {
public static int sumOfBeauties(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            List<Integer> left = new ArrayList<>();
            int leftMax = Integer.MIN_VALUE;
            int rightMax = Integer.MIN_VALUE;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] > leftMax) {
                    leftMax = nums[j];
                }
            }
            left.add(leftMax);
            int right = i + 1;
            while (right < nums.length) {
                if (nums[right] > rightMax) {
                    rightMax = nums[right];
                    left.add(rightMax);
                }
                right++;
            }
            total += left.size();
        }
        return total;
    }
}