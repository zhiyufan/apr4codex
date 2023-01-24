package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] sum = new int[nums.length - k + 1];
        for (int i = 0; i < k - 1; i++) {
            sum[0] += nums[i];
            }
        for (int i = 0; i + k -1 < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i + k - 1];
            }
        return Arrays.stream(sum).map(el -> el / k).toArray();
        }
    
    }
}
    
}