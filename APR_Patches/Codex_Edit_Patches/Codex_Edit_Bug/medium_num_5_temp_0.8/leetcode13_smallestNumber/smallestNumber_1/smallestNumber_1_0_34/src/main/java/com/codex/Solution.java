package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        int[] res = new int[10];
	long r = 0;
        while (num > 0) {
            res[(int)(num % 10)]++;	//frequency of digits in the number
            num /= 10;
        }
        int index = 0;
        for (int i = 1; i < 10; i++) {
            if (res[i] > 0) {
                index = i;
                res[i]--;
                break;
            }
        }
        long min = index;	//min no with same digits as that of input
        for (index = 0; index < 10; index++) {
            while (res[index]-- > 0) {
                min = min * 10 + index;
            }
        }
        return min;
    }
    
}