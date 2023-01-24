package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;

public class Study {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3};
        list(arr, 2);
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

    public static void list (int[] numbers, int target){
        List<Integer> res = targetIndices(numbers, target);
        System.out.println(res);
    }
}
}