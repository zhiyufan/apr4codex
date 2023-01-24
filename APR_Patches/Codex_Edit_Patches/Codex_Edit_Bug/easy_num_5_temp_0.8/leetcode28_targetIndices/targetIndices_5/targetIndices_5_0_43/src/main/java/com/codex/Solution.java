package com.codex;

import java.util.*;

public class Solution {
        public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        List<Integer> indices = targetIndices(nums, target);
        System.out.println(indices.get(0) + ", " + indices.get(1));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i];
            if (numToIndex.containsKey(num)) {
                result.add(numToIndex.get(num));
                result.add(i);
            numToIndex.put(target - num, i);
                return result;
            }
        }
        return result;
    }
}
}