package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(int[] nums, int s) {

        int low = Integer.MAX_VALUE;
        int sum = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            while (sum >= s) {
                low = Math.min(low, i - j + 1);
                sum -= nums[j];
                j++;
            }
        }

        return low == Integer.MAX_VALUE ? 0 : low;
    }
}