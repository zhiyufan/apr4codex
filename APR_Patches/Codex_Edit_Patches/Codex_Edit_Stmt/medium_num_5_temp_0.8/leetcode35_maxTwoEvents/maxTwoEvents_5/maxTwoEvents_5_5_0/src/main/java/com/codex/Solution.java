package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int maxTwoSubArrays(ArrayList<Integer> nums) {
        // write your code
        int[] left = new int[nums.size()];
        int[] right = new int[nums.size()];
        int sum = 0;
        int minSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
            max = Math.max(max, sum - minSum);
            minSum = Math.min(minSum, sum);
            left[i] = max;
        }

        sum = 0;
        minSum = 0;
        max = Integer.MIN_VALUE;
        for (int i = nums.size() - 1; i >= 0; i--) {
            sum += nums.get(i);
            max = Math.max(max, sum - minSum);
            minSum = Math.min(minSum, sum);
            right[i] = max;
        }
        max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size() - 1; i++) {
            max = Math.max(max, left[i] + right[i + 1]);
        }
        return max;
    }
}
}