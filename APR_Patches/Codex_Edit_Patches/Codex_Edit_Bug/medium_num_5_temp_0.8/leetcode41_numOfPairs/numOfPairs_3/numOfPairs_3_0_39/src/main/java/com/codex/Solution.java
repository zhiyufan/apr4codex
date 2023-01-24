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

    public static void main(String[] args) {

        System.out.println(numOfPairs(new String[]{"7","3","4"}, "47"));

    }

    
}