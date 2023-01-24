package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int flips = 0;
        int M = start ^ goal;
        int left = 0;
        while (M > 0) {
            if ((M & 1) == 1) {
                flips++;
            }
            M >>= 1;
            if ((start & 1) != (goal & 1)) {
                left++;
            }
            start >>= 1;
            goal >>= 1;
        }
        return flips + left;
    }
    
}