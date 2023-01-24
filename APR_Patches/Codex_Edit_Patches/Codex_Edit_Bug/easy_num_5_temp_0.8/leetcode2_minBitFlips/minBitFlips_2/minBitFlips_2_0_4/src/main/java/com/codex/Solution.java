package com.codex;

import java.util.*;

public class Solution {
//Given two positive integers L and R, find the maximal value of A xor B, where A and B satisfy the following condition:
//
//        L <= A <= B <= R
//        For example, if L = 10 and R = 15, then A = 10, B = 15, A xor B = 5.

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
        return flips + left - 1;
    }
    
}