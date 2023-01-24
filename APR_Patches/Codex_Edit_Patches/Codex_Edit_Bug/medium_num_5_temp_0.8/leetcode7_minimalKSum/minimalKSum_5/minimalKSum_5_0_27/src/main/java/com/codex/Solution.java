package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] A, int k) {
        
        Arrays.sort(A);
        int size = A.length;
        long sum = 0;
        int pos = 1;
        for (int i = 0; i < size; i++) {
            if (A[i] == pos) {
                pos++;
            } else if (A[i] < pos) {
                continue;
            } else {
                sum += pos;
                k--;
                pos++;
                i--;
            }
        }
        sum += (pos + k - 1) * k / 2;
        return sum;
    }

    
}