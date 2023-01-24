package com.codex;

import java.util.*;

public class Solution {
public static int[] getAverages(int[] nums, int k) {


        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < k; i++) {
        result[0] = sum / k;
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i - 1];
            sum += nums[i + k - 1];
            if (i + k < nums.length) {
                result[i] = sum / k;
            }
        }
        return result;
    }
}


    
}