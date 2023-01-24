package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] Shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for (int i = 0; i < nums.Length; i++) {
            result[i] = i%2 == 0 ? nums[i/2] : nums[i/2 + n];
        }
        return result;
}
    }

    
}