package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res.add(i);
            }
        }
        return res;
    }

    public static boolean linearSearch(String[] arr, String targetValue) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(targetValue)) {
                return true;
            }
        }
        return false;
    }


    
}