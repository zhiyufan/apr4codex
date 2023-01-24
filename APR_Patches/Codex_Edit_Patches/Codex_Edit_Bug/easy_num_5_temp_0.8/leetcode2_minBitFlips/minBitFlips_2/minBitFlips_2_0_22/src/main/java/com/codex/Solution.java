package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int flips = 0;
        int M = start ^ goal;
        int left = 0, startbit = -1;
        boolean flip = false;
        for (int i = 0; i < 31; i++) {
            int S = start >> i & 1;
            int G = goal >> i & 1;
            if ((M & 1) == 1) {
                flips++;
            }
            left++;
            M >>= 1;
        }
        return flips + left - 1;
    }
    
}