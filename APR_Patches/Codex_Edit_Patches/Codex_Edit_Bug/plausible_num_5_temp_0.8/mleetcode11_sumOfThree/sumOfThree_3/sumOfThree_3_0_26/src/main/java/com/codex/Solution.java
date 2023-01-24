package com.codex;

import java.util.*;

public class Solution {
public static void main(String[] args) {
        long num = 3;
        long[] result = getThreeNumbersForSum(num);
        System.out.println(Arrays.toString(result));
        num = 20;
        result = getThreeNumbersForSum(num);
        System.out.println(Arrays.toString(result));
        num = 49;
        result = getThreeNumbersForSum(num);
        System.out.println(Arrays.toString(result));
    }

    /**
     * 
     * @param num
     * @return
     */
    private static long[] getThreeNumbersForSum(long num) {
        
        long[] res = new long[3];
        for (int i = 1; i <= num / 3; i++) {
            for (int j = i + 1; j <= num / 2; j++) {
                for (int k = j + 1; k <= num / 1; k++) {
                    if (i + j + k == num)
                    {
                        res[0] = i;
                        res[1] = j;
                        res[2] = k;
                    }
                }
            }
        }
        return res;
    }
}