package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        
        List<Integer> res = new ArrayList<>();
        int curSum = 0;
        for(int i=0;i<nums.length;i++) {
            curSum+=nums[i];
        }
        int totalSum = curSum;
        int leftHalf = curSum/2;
        int rightHalf = (curSum+1)/2;
        
        return res;
    }

    
}