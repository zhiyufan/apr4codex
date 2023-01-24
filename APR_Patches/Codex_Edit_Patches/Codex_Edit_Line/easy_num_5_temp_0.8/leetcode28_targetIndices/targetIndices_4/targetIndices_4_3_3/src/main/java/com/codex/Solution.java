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


    public static int[] takeWhile(int[] arr, int target)
    {
        int[] result = new int[arr.length];
        int i = 0;
        while (i < arr.length && arr[i] < target) {
            result[i] = arr[i];
            i++;
        }
        return result;
    }
        return result;
    }

    
}