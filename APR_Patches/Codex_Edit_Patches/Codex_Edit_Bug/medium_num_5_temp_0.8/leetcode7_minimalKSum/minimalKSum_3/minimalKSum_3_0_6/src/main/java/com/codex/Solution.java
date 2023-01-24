package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] X, int k) {
        
        Arrays.sort(X);

        long result = 0;
        int i = 0, j = 0;
        while (i < X.length && j < k) {
            if (X[i] <= j + 1) {
                result += X[i++];
            } else {
                result += j + 1;
                j++;
            }
        }

        while (j < k) {
            result += j + 1;
            j++;
        }

        return result;
    }

    
}