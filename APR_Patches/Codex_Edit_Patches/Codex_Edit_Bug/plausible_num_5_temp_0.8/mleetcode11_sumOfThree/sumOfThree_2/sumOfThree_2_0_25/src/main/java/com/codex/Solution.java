package com.codex;

import java.util.*;

public class Solution {
File 1 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

import java.util.Arrays;

/**
 *
 * @author karim
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long[] array = sumOfThree(0);
        System.out.println(Arrays.toString(array));
        array = sumOfThree(10);
        System.out.println(Arrays.toString(array));
        array = sumOfThree(3);
        System.out.println(Arrays.toString(array));
    }
    
    public static long[] sumOfThree(long num) {        
        
        long[] array = new long[0];

        if (num < 3) return array;

        long[] array = new long[3];
        if (num < 3) {
            return new long[0];
        }
        for (long i = 0; i < num / 3; ++i) {
            long j = (num * (num - 2 * i) - i * i) / (2 * (num - i));
            long k = num - i - j;
            if (k > j && k > i) {
                array = new long[]{i, j, k};
                return array;
            } else {
                if (j < k && i < k) {
                    array = new long[]{i, j, k};
                    return array;
                }
            }
        }
        return array;
    }

    
}