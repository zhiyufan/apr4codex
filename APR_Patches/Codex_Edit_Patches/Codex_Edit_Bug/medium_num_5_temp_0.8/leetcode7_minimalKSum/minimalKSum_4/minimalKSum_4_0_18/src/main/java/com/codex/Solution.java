package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        if (nums == null || nums.length == 0) return 0;
        
        Arrays.sort(nums);

        int curr = 1;
        long count = 0;
        while(k != 0 && curr <= nums[nums.length-1]){
            int idx = Arrays.binarySearch(nums, curr);
            if(idx < 0){
                idx = idx * -1 - 1;
            }
            count += curr * (nums.length - idx);
            curr++;
            k--;
        }
        return count;
    }
}