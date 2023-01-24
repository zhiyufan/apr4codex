package com.codex;

import java.util.*;

public class Solution {
public static int[] sortJumbled(int[] mapping, int[] nums) {
    

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }

        int[] map = new int[mapping.length];
        for (int i = 0; i < mapping.length; i++) {
            map[mapping[i]] = i;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = map[nums[i]];
        }

        Arrays.sort(res);
        return res;
    }

    
}