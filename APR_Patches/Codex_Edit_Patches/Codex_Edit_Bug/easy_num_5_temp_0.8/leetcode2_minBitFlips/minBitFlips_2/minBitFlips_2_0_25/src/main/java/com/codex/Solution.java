package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int flips = 0;
        if (start == 0) {
            return flips;
        }
        int M = start ^ goal;
        int left = 0;
        while (M > 0) {
            if ((M & 1) == 1) {
                flips++;
            }
            left++;
            M >>= 1;
        }
        return flips + left - 1;
    }
    
}