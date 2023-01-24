package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        
        int minSum = Integer.MAX_VALUE;
        List<Integer> digits = new ArrayList<>();
        while (num != 0) {
            digits.add(num % 10);
            num /= 10;
        }
        return minSum;
    }

    
}