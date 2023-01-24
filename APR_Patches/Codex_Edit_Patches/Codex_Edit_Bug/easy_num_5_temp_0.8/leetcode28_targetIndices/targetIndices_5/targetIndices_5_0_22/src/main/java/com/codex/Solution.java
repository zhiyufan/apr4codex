package com.codex;

import java.util.*;

public class Solution {
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
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int target = 3;
        List<Integer> indices = targetIndices(nums, target);
        System.out.println(indices);
    }
}
}