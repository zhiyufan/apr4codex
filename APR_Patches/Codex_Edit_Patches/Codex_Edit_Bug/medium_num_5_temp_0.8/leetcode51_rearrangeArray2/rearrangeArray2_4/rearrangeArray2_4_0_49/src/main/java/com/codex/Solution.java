package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {

        double avg = aver(nums);
        List<Integer> list = new ArrayList<>();
        for (double num : nums) {
            if (num == avg) {
                continue;
            }
            list.add(num);
        }

        int[] ans = new int[nums.length];
        int index = 0;
        double[] a = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        Arrays.sort(a);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == avg) {
                ans[i] = a[a.length - 1];
                a[a.length - 1] = Integer.MIN_VALUE;
            } else {
                ans[i] = a[index++];
            }
        }
        return ans;
    }

    private static double aver(double[] nums) {
        double sum = 0.0;
        for (double num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }
}