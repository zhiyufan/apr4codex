package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        

        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        Collections.sort(digits);
        int first = 0;
        digits.forEach(digit->first = first*10 + digit);
        int second = 0;
         digits.forEach(digit->second = second*10 + digit);
         return first + second;
    }

    
}