package com.codex;

import java.util.*;

public class Solution {
    public static int[] findDifferentBinaryString(String[] nums) {
        
        int[] counts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            char[] current = nums[i].toCharArray();
            for (int j = 0; j < current.length; j++) {
                if (current[j] == '1') {
                    counts[j]++;
                }
            }
        }
        int[] res = new int[counts.length];
        for (int i = 0; i < counts.length; i++) {   
            res[i] = counts[i] * 2 > nums.length ? 0 : 1;
        }
        return res;
    }

    
}