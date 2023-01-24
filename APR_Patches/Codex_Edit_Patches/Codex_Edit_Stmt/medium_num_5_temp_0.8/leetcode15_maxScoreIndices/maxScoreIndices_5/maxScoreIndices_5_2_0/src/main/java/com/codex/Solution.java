package com.codex;

import java.util.*;

public class Solution {
public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int maxScore = 0;
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    counter++;
                }
            }
            for (int j = 0; j < i; j++) {
                if (nums[j] == 1) {
                    counter++;
                }
            }
            if (counter > maxScore) {
                maxScore = counter;
                result.clear( );
                result.add(i);        
            }
        }
        return result;
    }

    private static int getNumberOfZeros(int[] nums, int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == 0) {
                result++;
            }
        }
        return result;
    }

    
}