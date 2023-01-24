package com.codex;

import java.util.*;

public class Solution {
    /*
    Hints:
    1. for(int i = 1; i < num/3; i++) {
    2. for(int j = i; j < num; j++) {
    3. for(int k = j + 1; k < num; k++) {
    
    Results:
    1. 811.73
    2. 800.973
    3. 798.195
    */
    public static long[] sumOfThree(long num) {
        
        long[] result = new long[3];
        for (int i = 1; i < num/3; i++) {
            for (int j = i; j < num; j++) {
                for (int k = j + 1; k < num; k++) {
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
    
    /*
    Hints:
    1. for (int i = 1; i <= num/3; i++) {
    2. for (int j = i; j <= num; j++) {
    3. for (int k = j + 1; k <= num; k++) {
    
    Results:
    1. 757.883
    2. 748.756
    3. 749.091
    */
    public static long[] sumOfThree(long num) {
        
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
    
    /*
    Hints:
    1. for (int i = 1; i <= num/3; i++) {
    2. for (int j = i; j <= num; j++) {
    3. for (int k = j + 1; k <= num; k++) {
    
    Results:
    1. 757.883
    2. 748.756
    3. 749.091
    */
    public static long[] sumOfThree(long num) {
        
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
    
    /*
    Hints:
    1. for (int i = 1; i <= num/3; i++) {
    2. for (int j = i; j <= num; j++) {
    3. for (int k = j + 1; k <= num; k++) {
    
    Results:
    1. 757.883
    2. 748.756
    3. 749.091
    */
    public static long[] sumOfThree(long num) {
        
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
    
}