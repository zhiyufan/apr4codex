package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int flips = 0;
        int M = start ^ goal;
        int left = 0;
        while (M >= 1) {
            if ((M & 1) == 1) {
                flips++;
            }
            left += 1;
            M >>= 1;
        }
        return flips + (left == start ? 1 : 0);
    }
    
}