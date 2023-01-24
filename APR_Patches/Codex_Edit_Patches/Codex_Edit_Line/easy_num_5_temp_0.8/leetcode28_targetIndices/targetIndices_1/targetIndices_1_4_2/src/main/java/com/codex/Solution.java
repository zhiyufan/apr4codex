package com.codex;

import java.util.*;

public class Solution {
#include<iostream>

    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res.add(i);
            }
            else res.add(-1);
        }
        return res;
    }

}