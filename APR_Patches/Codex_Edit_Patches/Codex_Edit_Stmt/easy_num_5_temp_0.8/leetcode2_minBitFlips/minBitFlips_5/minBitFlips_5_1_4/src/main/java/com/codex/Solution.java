package com.codex;

import java.util.*;

public class Solution {
    /**
     *  Flip the bit of start at the i'th position.
     *  And then compare start with goal.
     *  If we could not find a position to flip, return -1.
     *  Otherwise, return the count of flipped bit.
     * 
     *  Time complexity: O(31)
     */
    public static int minBitFlips(int start, int goal) {
        
        int count = 0;
        int i = 0;
        while (start != goal) {
            if ((start & 1) != (goal & 1)) {
                if (i > 0 && start == (goal ^ (1 << i))) {
                    return -1;
                }
                count++;
                start ^= 1 << i;
            }
            start >>= 1;
            i++;
        }
        return count;
    }

    
}