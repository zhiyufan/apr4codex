package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {



        int[] result = new int[nums.length];
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        result[k - 1] = sum / k;

        for (int i = k; i < nums.length - k; i++) {

            sum = sum - nums[i - k] + nums[i];
            result[i] = (int) Math.floor((double) sum / k);
        }
        return result;
    }
}