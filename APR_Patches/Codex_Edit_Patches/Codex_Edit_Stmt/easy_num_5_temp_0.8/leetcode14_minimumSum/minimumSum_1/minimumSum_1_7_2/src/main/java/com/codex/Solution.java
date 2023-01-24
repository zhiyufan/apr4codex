package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        

        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        int first = 0, second = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            first = first * 10 + digits.get(i);
            if (i > 0)
                second = second * 10 + digits.get(i - 1);
        int carry = 0;
        for(int i = 0; i < digits.size() - 1; i++) {
            int sum = carry + digits.get(i) + digits.get(i + 1);
            if(sum >= 10) {
                digits.set(i + 1, sum - 10);
                carry = 1;
            } 
        }
        if(carry == 1) {
            digits.set(digits.size() - 1, digits.get(digits.size() - 1) + 1);
        }
        Collections.sort(digits);
            i--;
        }
        return first + second;
    }
}