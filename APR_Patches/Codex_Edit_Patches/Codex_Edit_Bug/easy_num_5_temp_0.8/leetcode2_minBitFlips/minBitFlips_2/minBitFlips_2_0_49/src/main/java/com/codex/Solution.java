package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
    int N = goal.length;
    int flip = 0;
    int res = 0;
    int rightMostOne = 0;
    for (int i = 0; i < N; ++i) {
        if (goal[i] != ((start[i] + flip) & 1)) {
            res++;
            flip ^= 1;
            rightMostOne = i;
        }
        return flips + left - 1;
    }
    
}