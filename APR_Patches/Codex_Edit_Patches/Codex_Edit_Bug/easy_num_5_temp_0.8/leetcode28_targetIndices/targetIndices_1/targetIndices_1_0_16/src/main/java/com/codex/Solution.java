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

    public static void main(String args[]) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 6;
        System.out.println(targetIndices(nums, target));
    }
}