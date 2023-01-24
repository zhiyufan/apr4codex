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
        left++;
        M >>= 1;
    }
    if (flips == 0) {
        return 0;
    }
    else if (flips == 1) {
        if (start == 1) {
            return left;
        }
        else {
            return left - 1;
        }
    }
    else {
        int count = 0;
        while (M > 0) {
            if ((M & 1) == 1) {
                count++;
            }
            left++;
            M >>= 1;
        }
        return flips + left - 1;
    }
    
}