package com.codex;

import java.util.*;

public class Solution {
    static long smallestNumber(long num) {
        
        long n = num;
        ArrayList<Integer> digits = new ArrayList<>();
        int ten = (int) Math.pow(10, digits.size() - 1);
        while (n > 0) {
            int digit = (int)(n % 10);
            digit = digit * ten;
            digits.add(digit);
            n = n / 10;
        }

        if (digits.get(0) == 0) {
            for (int i = 1; i < digits.size(); i++) {
                if (digits.get(i) != 0) {
                    int temp = digits.get(0);
                    digits.set(0, digits.get(i));
                    digits.set(i, temp);
                    break;
                }
            }
        }

        Collections.sort(digits);
        for (int i = 0; i < digits.size(); i++) {
            digits.set(i, digits.get(i) / ten);
        }

        n = 0;
        for (int i = 0; i < digits.size(); i++) {
            n = 10 * n + digits.get(i);
        }
        return n;
    }

    
}