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
        int first = 0, second = 0;
        for (int i = digits.size() - 1, j=0; i >= 0; i--, j++) {
            first = first * 10 + digits.get(i);
            if (j > 0)
                second = second * 10 + digits.get(i - 1);
            i--;
        }
        return first + second;
    }

    
}