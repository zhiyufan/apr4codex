package com.codex;

import java.util.*;

public class Solution {
// This program checks for the elements that are equal to the n +1 element. 
// It does not take 0(n^2) time rather it takes 0(n)

// Created by Prerna Sharma

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            map.put(nums[i], 0);
        }
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(nums[i] + 1)) {
                count++;
            }
        }
        return count;
    }


}
    
}