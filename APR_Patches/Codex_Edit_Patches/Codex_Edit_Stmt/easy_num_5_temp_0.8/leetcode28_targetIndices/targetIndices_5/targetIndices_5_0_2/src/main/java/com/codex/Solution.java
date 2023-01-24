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



    public static int[] targetIndices(int[] nums, int target) {
        int[] result = new int[] {-1, -1};
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (found == false) {
                    found = true;
                    result[0] = i;
                } else {
                    result[1] = i;
                }
            }
        }
        return result;
    }
}