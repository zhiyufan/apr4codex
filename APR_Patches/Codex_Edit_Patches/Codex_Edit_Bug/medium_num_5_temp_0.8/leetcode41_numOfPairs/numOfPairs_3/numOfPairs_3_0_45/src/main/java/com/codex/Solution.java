package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Integer.parseInt(nums[i] + nums[j]) == Integer.parseInt(target) || Integer.parseInt(nums[j] + nums[i]) == Integer.parseInt(target)) ans++;
            }
        }
        return ans;
    }


    // In the case that we have to check for equal value pairs
    public static int numOfPairs(String[] nums, String target) {

        int ans = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if((Integer.parseInt(nums[i] + nums[j]) == Integer.parseInt(target) ||
                        Integer.parseInt(nums[j] + nums[i]) == Integer.parseInt(target)) &&
                        !nums[j].equals(nums[i])){
                    ans++;
                }
            }
        }
        return ans;
    }
    
}