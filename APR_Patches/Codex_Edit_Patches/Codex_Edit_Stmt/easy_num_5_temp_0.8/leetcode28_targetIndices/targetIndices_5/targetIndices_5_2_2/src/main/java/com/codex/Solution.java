package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        

            // <WRONG>
            // if (nums[i] == target) {
            // </WRONG>
            // <CORRECT>
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
            // </CORRECT>
                result.add(i);
            }
        }
        return result;
    }

    
}