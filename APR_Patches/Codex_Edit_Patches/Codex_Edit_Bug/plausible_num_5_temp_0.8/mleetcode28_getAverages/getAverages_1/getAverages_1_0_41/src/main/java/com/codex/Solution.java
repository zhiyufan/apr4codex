package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        vector<int> v;
        for(int i = k; i < nums.size() - k; i++) {
            
            int sum = 0;
            for(int j = i - k; j < i + k + 1; j++) {
                sum += nums[j];
            } 
            v.push_back(sum / (2 * k + 1));
        }  
        return v;
    }
}