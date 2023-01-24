package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        int count = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            if (nums[i] == target) {
                res.add(i);
                count++;
            }
        }
        return res;
    }
}