package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<Integer> result = targetIndices(new int[]{1, 1, 2, 2, 2, 4, 5, 5, 5, 8}, 8);
    }

    public static List<Integer> targetIndices(int[] nums, int target) {        

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }
        return result;
    }

    
}