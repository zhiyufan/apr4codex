package com.codex;

import java.util.*;

public class Solution {
public static int minBitFlips(int start, int goal) {
        
        if (start == goal) {
            return 0;
        }
        
        // Count of flips
        int count = 0;
        
        // Current index
        int i = 0;

        while (start != goal) {
            // Check the odd/even bit
            if ((start & 1) != (goal & 1)) {
                count++;
                // Determine if it is possible to finish
                if (i > 0 && start == (goal ^ (1 << i))) {
                    return -1;
                }
                // Flip the bit
                start ^= (1 << i);
            }
            start >>= 1;  // bit shift
            goal >>= 1;   // bit shift
            i++;
        }
        
        return count;
    }

    
}