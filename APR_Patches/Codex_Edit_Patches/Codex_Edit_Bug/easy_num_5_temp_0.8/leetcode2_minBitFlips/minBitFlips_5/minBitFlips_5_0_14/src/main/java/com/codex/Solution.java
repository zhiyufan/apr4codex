package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int count = 0;
        int i = 0;
        while (start != goal) {
            if ((start & 1) != (goal & 1)) {
                count++;
                if (i > 0 && start == (goal ^ (1 << i))) {
                    return -1;
                }
                start ^= 1 << i;
            }
            start >>= 1;
            goal >>= 1;
            i++;
        }
        return count;
    }
        // Compute the xor of all elements in the array, and get its last set bit in the form of pow(2, k), 
        // that would be the result;
        int tmp = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            tmp ^= nums[i];
        }

    
}