package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int findMaxAverage(int[] nums, int k) {
        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp += nums[i];
        }   
        int result = temp;
        for (int i = k; i < nums.length; i++) {
            temp = temp - nums[i - k] + nums[i];
            result = Math.max(result, temp);
        }   
        return result / k;
    }
}
}