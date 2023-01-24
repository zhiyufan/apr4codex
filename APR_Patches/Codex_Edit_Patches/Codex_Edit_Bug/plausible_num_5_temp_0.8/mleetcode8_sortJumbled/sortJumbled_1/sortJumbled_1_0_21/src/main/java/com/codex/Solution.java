package com.codex;

import java.util.*;

public class Solution {
public static int[] sortJumbled(int[] mapping, int[] nums) {
    
    int[] res = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        res[i] = nums[i];
    }
    Arrays.sort(res);
    
    int[] map = new int[10];
    for (int i = 0; i < 10; i++) {
        map[mapping[i]] = res[i];
    }
    
    for (int i = 0; i < nums.length; i++) {
        nums[i] = map[nums[i]];
    }
    
    Arrays.sort(nums);
    return nums;
}
    
    public static void main(String[] args) {
        int[] mapping = {0,1,2,3,4,5,6,7,8,9};
        int[] nums = {8,0,1,7,6,5,4,3,2,9};
        int[] ans = sortJumbled(mapping, nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
}