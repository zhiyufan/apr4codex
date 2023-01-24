package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] arrive, int[] speed) {
        
        int minimumIndex = 0;
        for (int i = 1; i < arrive.length; i++) {
            if (arrive[i] > arrive[minimumIndex]) {
                minimumIndex = i;
                continue;
            }
            if (arrive[i] == arrive[minimumIndex] && speed[i] < speed[minimumIndex]) {
                minimumIndex = i;
            }
        }
        int count = 1;
        for (int i = 0; i < minimumIndex; i++) {
            if (Math.abs(arrive[i] - arrive[minimumIndex]) <= speed[i] * speed[minimumIndex]) {
                count++;
            }
        }
        return count;
    }
    
}