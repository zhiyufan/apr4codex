package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int findSmallestDivisor(int[] nums, int threshold) {
        
        int left = 0;
        int right = 0;
        for (int num : nums) {
            right += num;
            left = Math.max(left, num);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int num : nums) {
                count += (num - 1) / mid + 1;
            }
            if (count <= threshold) {
                right = mid;
            } else {
                left = mid + 1; 
            }
        }

        return left;
    }

    
}
    
}