package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(ArrayList<Integer> nums, int target) {
        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == target) {
                res.add(i);
            }
        }
        return res;
    }

    
}