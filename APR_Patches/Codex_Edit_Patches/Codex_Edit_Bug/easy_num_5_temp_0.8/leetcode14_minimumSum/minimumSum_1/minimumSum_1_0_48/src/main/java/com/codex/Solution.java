package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        // In this method we first break the number into digits and put them
        // into a list. Then we sort the list and put the digits back in a number
        // in the descending order. Then we add the two largest digits in the list
        // together.

        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
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