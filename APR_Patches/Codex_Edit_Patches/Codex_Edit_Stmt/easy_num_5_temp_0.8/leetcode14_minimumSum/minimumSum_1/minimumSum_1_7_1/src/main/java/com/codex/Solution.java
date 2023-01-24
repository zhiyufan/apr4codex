package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        

        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
        int first = 0, second = 0;
        
            num /= 10;
        }
        Collections.sort(digits);
        int n = digits.size();
        first = digits.get(n - 1);
        if (n > 1)
        second = digits.get(n - 2);
        for (int i = n - 3; i >= 0; i--) {
            first = first * 10 + digits.get(i);        
        }
        return first + second;
    }

    
}