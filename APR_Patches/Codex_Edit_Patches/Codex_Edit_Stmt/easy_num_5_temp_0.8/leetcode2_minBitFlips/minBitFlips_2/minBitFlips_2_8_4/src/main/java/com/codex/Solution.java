package com.codex;

import java.util.*;

public class Solution {
    public static int countFlips(int start, int goal) {
        
        int flips = start == goal ? 0 : 1;
        int M = start ^ goal;
        int left = 0;
        while (M > 0) {
            if ((M & 1) == 1) {
                flips ^= 1;
            }
            left++;
            M >>= 1;
        }
        return flips + left - 1;
    }
    
}