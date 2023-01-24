package com.codex;

import java.util.*;

public class Solution {
public static long[] sumOfThree(long num) {
    
    long[] array = new long[0];
    long counter = 0;
    
    if (num < 3) return array;
    
    for (long a = 1; a < num - 1; ++a) {
        for (long b = a + 1; b < num; ++b) {
            for (long c = b + 1; c < num + 1; ++c) {
                    if (a + b + c == num) {     
                        counter++;
                        array = new long[counter];
                        array[counter - 1] = a;
                        array[counter - 1] = b;
                        array[counter - 1] =c;
                    }
                }
            }
        }
        return array;
    }

    
}