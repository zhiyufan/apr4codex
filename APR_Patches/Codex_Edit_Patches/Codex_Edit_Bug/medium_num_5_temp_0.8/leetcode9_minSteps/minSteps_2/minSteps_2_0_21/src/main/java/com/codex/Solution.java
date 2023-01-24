package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        int count = n - 2;
        boolean[] notPrime = new boolean[n];
        notPrime[0] = true;
        notPrime[1] = true;
        for (int i = 2; i * i < n; i++) {
            if (!notPrime[i]) {
                for (int j = 2; i * j < n; j++) {
                    if (!notPrime[i * j]) {
                        count--;
                        notPrime[i * j] = true;
                    }
                }
            }
        }
        return result / 2;
    }

    
}