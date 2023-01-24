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




    public static List<String> getPowerPair(String[] numbers, int target) {

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (Math.pow(Integer.parseInt(numbers[i]), 2) + Math.pow(Integer.parseInt(numbers[j]), 2) == target) {
                    ans.add(numbers[i]);
                    ans.add(numbers[j]);
                    ans.add(Integer.toString(i));
                    ans.add(Integer.toString(j));
                    return ans;
                }
            }
        }
        return ans;
    }
    
    
}