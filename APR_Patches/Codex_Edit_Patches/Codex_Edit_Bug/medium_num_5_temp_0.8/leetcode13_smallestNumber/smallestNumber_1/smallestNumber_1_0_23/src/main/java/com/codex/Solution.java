package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long n) {
        
        int[] res = new int[10];
        while (n > 0) {
            res[(int)(n % 10)]++;
            n /= 10;
        }
        int index = 0;
        for (int i = 1; i < 10; i++) {
            if (res[i] > 0) {
                index = i;
                res[i]--;
                break;
            }
        }
        long min = index;
        for (index = 0; index < 10; index++) {
            while (res[index]-- > 0) {
                min = min * 10 + index;
            }
        }
        return min;
    }
    
}