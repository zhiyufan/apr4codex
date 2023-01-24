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
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1};

        List<Integer> indices = targetIndices(nums, 3);
        System.out.println("Indices: " + indices);
        System.out.println("Expected: [2, 6, 10]");

        List<Integer> indices2 = targetIndices(nums, 4);
        System.out.println("Indices: " + indices2);
        System.out.println("Expected: [3, 7, 11]");
        }
        return result;
    }

}
}