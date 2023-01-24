package com.codex;

import java.util.*;

public class Solution {
// reference :http://www.programcreek.com/2014/05/leetcode-super-ugly-number-java/

// method 1
public int nthSuperUglyNumber(int n, int[] prime) {
    int[] res = new int[n];
    int[] index = new int[prime.length];

    res[0] = 1;
    for (int i = 1; i < n; i++) {
        res[i] = Integer.MAX_VALUE;
        for (int j = 0; j < prime.length; j++) {
            res[i] = Math.min(res[i], res[index[j]] * prime[j]);
        }

        for (int j = 0; j < prime.length; j++) {
            if (res[i] == res[index[j]] * prime[j]) {
                index[j]++;
            }
        }
    }

    return res[n - 1];
}

    
}