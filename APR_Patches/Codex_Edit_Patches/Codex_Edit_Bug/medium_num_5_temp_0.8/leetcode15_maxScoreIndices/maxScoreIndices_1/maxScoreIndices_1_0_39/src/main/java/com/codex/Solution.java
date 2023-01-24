package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int[] maxScoreIndices(int[] nums) {
        
        int n = nums.length - 1;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        
        left[0] = 0;
        right[n] = 0;
        
        int i = 0;
        while(i <= n) {
            left[i + 1] = left[i] + nums[i];
            i++;
        }
        
        i = n;
        while(i > 0) {
            right[i - 1] = right[i] + (1 - nums[i]);
            i--;
        }
        
        int max = left[1] + right[1];
        int low = 0;
        int high = n;
        
        for (int i = 0; i < n; i++) {
            if (max < left[i] + right[i]) {
                max = left[i] + right[i];
                low = i;
                high = i;
            } else if (max == left[i] + right[i]) {
                high = i;
            }
        }
        return new int[] {low, high};
    }
}
}