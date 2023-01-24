package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int max = -1;
        int leftSum = 0;
        int rightSum = IntStream.of(nums).sum();
        for (int i = 0; leftSum <= rightSum; i++) {
            if (rightSum - leftSum > max) {
                max = rightSum - leftSum;
                ans.add(i);
            }
            leftSum += nums[i];
            rightSum -= nums[i];
        }
        return ans;
    }

    
}