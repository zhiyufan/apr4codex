package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        

        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        int i = 0;
        while (i < digits.size()) {
            int digit = digits.get(i);
            if (first == 0 && digit == 0) {
                i++;
                continue;
            }
            first = first * 10 + digit;
            i++;
        }
        i = 0;
        while (i < digits.size()) {
            int digit = digits.get(i);
            if (second == 0 && digit == 0) {
                i++;
                continue;
            }
            second = second * 10 + digit;
            i++;
        }
        return first + second;
    }

    































        for (int i = digits.size() - 1; i >= 0; i--) {
            first = first * 10 + digits.get(i);
            if (i > 0)
                second = second * 10 + digits.get(i - 1);
            i--;
        }
        return first + second;





































    public static int minimumSum(int num) {
        

        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        Collections.sort(digits);
        int first = 0, second = 0;
        Collections.sort(digits);
        int first = 0, second = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            first = first * 10 + digits.get(i);
            if (i > 0)
                second = second * 10 + digits.get(i - 1);
            i--;
        }
        return first + second;
    }

    
}