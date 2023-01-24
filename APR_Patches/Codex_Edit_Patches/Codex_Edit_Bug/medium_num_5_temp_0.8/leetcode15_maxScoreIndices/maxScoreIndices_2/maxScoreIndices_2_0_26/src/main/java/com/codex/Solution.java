package com.codex;

import java.util.*;

public class Solution {
// find all index that 0 and 1 have the same sum in both left and right part.
/*
    Input: nums = [0, 1, 0, 0, 1, 1, 0], Output: [3,4]
*/
class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        
        int n = nums.length;
        if (n == 0) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int maxSum = -1;
        
        int[] leftCount = new int[n];
        int[] rightCount = new int[n];
        int cur = 0;
        for (int i = 0; i < n; i++) {
            cur += nums[i];
            leftCount[i] = cur;
        }
        cur = 0;
        for (int i = n - 1; i >= 0; i--) {
            cur += nums[i] ^ 1;
            rightCount[i] = cur;
        }
        for (int i = 0; i < n; i++) {
            int leftSum = i == 0 ? 0 : leftCount[i - 1];
            int rightSum = i == n - 1 ? 0 : rightCount[i + 1];
            int totalSum = leftSum + rightSum;
            
            if (totalSum > maxSum) {
                maxSum = totalSum;
                //res = new ArrayList<>();
                //res.add(i);
                res.clear();
            } 
            if (totalSum == maxSum) {
                res.add(i);
            }
        }
        return res;
    }

    
}