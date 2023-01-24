package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indices.add(i);
            }
        }
        Collections.sort(indices);
        return indices;
    }


### Fix

    public static List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indices.add(i);
            }
        }
        Collections.sort(indices);
        return indices;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50, 60, 60, 70, 70, 80, 90, 90, 100 };
        int target = 90;
        List<Integer> indices = targetIndices(nums, target);

        System.out.println("Expected Indices - indexes of target in nums array");
        System.out.println("10, 20, 30, 40, 50, 60, 60, 70, 70, 80, 90, 90, 100");
        System.out.println("Target :"+ target);
        System.out.println("Found Indices :"+ Arrays.toString(indices.toArray()));
        System.out.println("Expected Indices :[10, 11, 12]");

    }
}