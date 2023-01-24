package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);

        long result = 0;
        int i = 0, j = 0;
        while (i < nums.length && j < k) {
            if (nums[i] <= j + 1) {
                result += nums[i++];
            } else {
                result += j + 1;
                j++;
            }
        }

        while (j < k) {
            result += j + 1;
            j++;
        }

        return result;


        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < (res + 1)){
                res += nums[i];
            }else{
                int temp = Math.max(nums[i], res + 1);
                res += temp;
            }
        }
        return res;
    }

    
    
}