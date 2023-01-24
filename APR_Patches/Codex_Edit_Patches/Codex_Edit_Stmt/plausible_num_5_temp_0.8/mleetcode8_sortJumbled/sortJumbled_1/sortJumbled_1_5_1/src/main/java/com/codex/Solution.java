package com.codex;

import java.util.*;

public class Solution {
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = mapping[nums[i]];
        }
        Arrays.sort(res);

        return res;
    }

    
}