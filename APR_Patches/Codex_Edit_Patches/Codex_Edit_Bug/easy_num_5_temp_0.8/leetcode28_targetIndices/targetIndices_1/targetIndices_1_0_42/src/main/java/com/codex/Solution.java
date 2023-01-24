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

    public static void main(String[] args) {
        int[] nums = {9, 5, 9, 2, 6};
        int[] indices = targetIndices(nums, 9);

        for (int i : indices) {
            System.out.println(i);
        }
    }
}
}