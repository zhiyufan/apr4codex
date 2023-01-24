package com.codex;

import java.util.*;

public class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = mapping[nums[i]];
        }
        Arrays.sort(res);

        for (int i = 0; i < 10; i++) {
            nums[i] = mapping[i];
        }

        if (Arrays.equals(res, nums)) {
            return new int[]{};
        }
        return new int[]{-1};
    }

    
}