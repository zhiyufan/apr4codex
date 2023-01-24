package com.codex;

import java.util.*;

public class Solution {
public class MinMax {
    public int min(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int result = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if ((nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) ||
                    (nums[i - 1] > nums[i] && nums[i] < nums[i + 1])) {
                result++;
            }
        }
        return result;
    }

    
}