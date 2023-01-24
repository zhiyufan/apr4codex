package com.codex;

import java.util.*;

public class Solution {
    public static long smallestDigit(long num) {
        long smallestDigit = 9;
        while (num > 0) {
            if (num % 10 < smallestDigit) {
                smallestDigit = num % 10;
            }
            num /= 10;
        }
        return smallestDigit;
    }


    public static long smallestNumber(long N) {
        long smallestNumber = N;
        if (N >= 0 && N <= 1e9) {
            for (int i = 1; i <= 9; i++) {
                if (N % i == 0) {
                    long number = N;
                    int j = 0;
                    while (j < 9) {
                        number = setDigit(N, j, i);
                        if (number < smallestNumber && number > 0) {
                            smallestNumber = number;
                        }
                        j++;
                    }
                }
            }
        }
        return smallestNumber;
    }

    public static long setDigit(long num, int digit, int value) {
        String number = String.valueOf(num);
        StringBuilder sb = new StringBuilder(number);
        StringBuilder newS = sb.replace(digit, digit + 1, String.valueOf(value));
        return Long.parseLong(newS.toString());
    }
}