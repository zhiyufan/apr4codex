package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int flips = 0;
        int M = start ^ goal;
        int left = 0, right = M, curr = 0;
        while (M > 0) {
            if ((M & 1) == 1) {
                if ((start & 1) == ((curr & 1) ^ 1)) {
                    flips++;
                }
            } else {
                flips ^= curr ^ left;
            }
            left++;
            right >>>= 1;
            curr ^= right;
            M >>= 1;
        }
        return flips + left;
    }
    
}