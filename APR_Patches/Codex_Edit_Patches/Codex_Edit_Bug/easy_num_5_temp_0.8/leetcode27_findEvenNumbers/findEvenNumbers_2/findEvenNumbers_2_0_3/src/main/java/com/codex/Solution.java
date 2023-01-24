package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        if (digits.length < 3) return new int[0];
        int number = 0;
        int result = 0;
        for (int i = 0; i < 3; i++){
            number += digits[i]*Math.pow(10, 2-i);
        }
        if (number % 2 == 0) {
            result++;
        }
        for (int i = 1; i < digits.length - 2; i++){
            number -= digits[i-1]*100;
            number += digits[i+2];
            if (number % 2 == 0) {
                result++;
            }
        }
        int[] res = new int[result];
        if (res.length < 1) return res;
        res[0] = number;
        int counter = 1;
        for (int i = 1; i < digits.length - 2; i++){
            number -= digits[i-1]*100;
            number += digits[i+2];
            if (number % 2 == 0) {
                res[counter++] = number;
            }
        }
        return res;
    }

    
}