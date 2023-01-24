package com.codex;

import java.util.*;

public class Solution {
    /*public static long[] sumOfThree(long num) {
        
        long[] result = new long[3];
        for (int i = 1; i <= num/3; i++) {
            for (int j = i; j <= num; j++) {
                for (int k = j + 1; k <= num; k++) {
                    if (i + j + k == num) {
                        result[0] = i;
                        result[1] = j;
                        result[2] = k;
                    }
                }
            }
        }
        return result;
    }
    */
    
    /*
    !!! I made some changes in the program.
    !!! This is a efficient implementation.
    */
    public static long[] sumOfThree(long num) {
        long[] result = new long[3];
        int i = 1;
        int j = i;
        int k = j + 1;
        
        for (; i <= num/3; i++) {
            for (; j <= num/2; j++) {
                for (; k <= num; k++) {
                    if (i + j + k == num) {
                        result[0] = i;
                        result[1] = j;
                        result[2] = k;
                    }
                }
            }
        }
        return result;
    }
}