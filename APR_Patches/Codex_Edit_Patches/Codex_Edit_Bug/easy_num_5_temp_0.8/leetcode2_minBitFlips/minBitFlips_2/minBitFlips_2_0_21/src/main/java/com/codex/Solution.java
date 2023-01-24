package com.codex;

import java.util.*;

public class Solution {

// Complexity: O(log(max(start, goal)))

    public static int minBitFlips(int start, int goal) {
        
        int flips = 0;
        int M = start ^ goal;
        int left = 0; 

        while (M > 0) {
            if ((M & 1) == 1) {
                // if there is a difference, flip the end bit, then flip the left bits
                flips++;
                left++;
            }
            M >>= 1;
        }
        return flips + Math.max(0, left - 1);
    }
    
}