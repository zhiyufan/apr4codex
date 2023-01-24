package com.codex;

import java.util.*;

public class Solution {
 public static int countHillValley(int[] nums) {
        int count = 1;
        int prev = nums[0];
        boolean inc = true;
        boolean dec = true;
        for(int i = 1; i < nums.length; i++){
            if(prev > nums[i]){
                dec = false;
            }else if(prev <  nums[i]){
                inc = false;
            }
            if(inc == false && dec == false){
                count++;
                inc = true;
                dec = true;
            }
            prev = nums[i];
        }
        return count;
}

    }


    
}