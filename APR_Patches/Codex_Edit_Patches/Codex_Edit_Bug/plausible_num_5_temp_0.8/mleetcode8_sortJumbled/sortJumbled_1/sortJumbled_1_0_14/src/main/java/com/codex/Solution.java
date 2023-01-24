package com.codex;

import java.util.*;

public class Solution {
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        

        int[] res = new int[10];
        for (int i = 0; i < 10; i++) {
            res[mapping[i]] = i;
        }
        

        int[] map = new int[10];
        for (int i = 0; i < 10; i++) {
            map[i] = res[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = map[nums[i]];
        }

        Arrays.sort(nums);
        return nums;
    }

    
}