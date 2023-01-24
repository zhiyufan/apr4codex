package com.codex;

import java.util.*;

public class Solution {
    public static int findMinFibonacciNumbers(int k) {
        int index = 1;
        while (fib(index) <= k) {
            index++;
        }
        int f = fib(index - 1);
        int count = 0;
        while (k != 0) {
            if (f <= k) {
                k -= f;
                count++;
            } else {
                index--;
                f = fib(index);
            }
        }
        return dp[n - 1];
    }

    
}