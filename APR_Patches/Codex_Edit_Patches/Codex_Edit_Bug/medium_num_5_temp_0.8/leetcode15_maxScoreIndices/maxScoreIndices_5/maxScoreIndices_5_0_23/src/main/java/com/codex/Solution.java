package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {

        int maxScore = 0;
        int maxIndex = 0;
        List<Integer> maxScoreIndices = new LinkedList<Integer>();
        
        for (int i = 0; i + 1 < nums.length; i++) {
            if (nums[i] + nums[i + 1] > maxScore) {
                maxScore = nums[i] + nums[i + 1];
                maxIndex = i;
                maxScoreIndices.clear();
                maxScoreIndices.add(maxIndex);
            } else if (nums[i] + nums[i + 1] == maxScore) {
                maxScoreIndices.add(i);
            }
        }

        return maxScoreIndices;
    }
}