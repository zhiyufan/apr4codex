package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 5, 2, 7, 3};
        int target = 3;
        int expectedOutput = [4];

        List<Integer> output = targetIndices(nums, target);
        
    }
}