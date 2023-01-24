package com.codex;

import java.util.*;

public class Solution {
// Does not consider case like 1,1,1,1,1
public static List<Integer> minSubsequence(int[] nums) {
    List<Integer> result = new ArrayList<Integer>();
    Arrays.sort(nums);
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
    }
    int curr = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
        curr += nums[i];
        result.add(nums[i]);
        if (curr > sum / 2) break;
    }
    
    return result;
}

// Fixed solution
public static int[] minSubsequence(int[] nums) {
    if (nums == null || nums.length == 0) return new int[]{};
    if (nums.length == 1) return nums;
    if (nums.length == 2 && nums[0] == nums[1]) return nums;
    Arrays.sort(nums);
    int sum = 0;
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
    }
    
    int curr = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
        curr += nums[i];
        res++;
        if (curr > sum / 2) break;
    }
    
    int[] ans = new int[res];
    int index = 0;
    for (int i = nums.length - 1; i >= nums.length - res; i--) {
        ans[index++] = nums[i];
    }
    
    return ans;
}

    
}