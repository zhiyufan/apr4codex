package com.codex;

import java.util.*;

public class Solution {
public static int countPeakValley(int[] nums) {
        int count = 0 , len = nums.length;
        if(len < 3) return count;
        boolean flag = true, first = true;
        int prev = nums[0];
        for(int i = 1; i < len; i++){
            int curr = nums[i];
            if(prev > curr){
                if(flag && !first){
                    count++;
                }
                first = false;
                flag = false;
            }
            else{
                if(!flag && !first){
                    count++;
                }
                first = false;
                flag = true;
            }

            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    
}