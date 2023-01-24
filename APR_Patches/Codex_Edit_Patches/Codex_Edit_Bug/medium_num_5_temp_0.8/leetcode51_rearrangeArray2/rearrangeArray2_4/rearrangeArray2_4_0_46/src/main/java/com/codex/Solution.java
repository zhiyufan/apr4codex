package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray(int[] nums) {
        
        if (nums == null || nums.length == 0) return nums;
        int len = nums.length;
        if (len == 1) return nums;

        double avg = 0.0;
        for (int i = 0; i < len; i++) {
            avg += nums[i];
        }
        avg = avg / len;

        int index = 0;
        int[] b = new int[len];
        int[] ans = new int[len];

        for (int i = 0; i < len; i++) {
            if (nums[i] != avg) a[index++] = nums[i];
        }

        Arrays.sort(a, 0, index);
        index = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == avg) b[i] = -1;
            else b[i] = index++;
        }

        for (int i = 0; i < len; i++) {
            if (b[i]  == -1) ans[i] = (int)avg;
            else ans[i] = a[b[i]];
        }
        return ans;
    }

    private static double aver(int[] nums) {
        double sum = 0.0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    
}