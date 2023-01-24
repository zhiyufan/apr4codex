package com.codex;

import java.util.*;

public class Solution {
public static int minBitFlips(int start, int goal) {
        
    int flips = 0;
    int xor = start ^ goal;
    int left = 0;
    while (xor > 0) {
        int lsb = xor & 1;
        xor >>= 1;
        if (lsb == 1)
            flips++;
        left++;
    }
    return flips + left - 1;
}
    
}