package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        double avg = average(nums);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == avg) continue;
            list.add(nums[i]);
        }

        int[] ans = new int[nums.length];
        int index = 0;

        int[] numsCopy = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            numsCopy[i] = list.get(i);
        }
        Arrays.sort(numsCopy);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == avg) {
                ans[i] = numsCopy[numsCopy.length - 1];
            } else {
                ans[i] = numsCopy[index++];
            }
        }

        return ans;
    }


    private static double average(int[] nums) {
        double sum = 0.0;
        for (int num : nums) {

            sum += num;
        }
        return sum / nums.length;
    }
}