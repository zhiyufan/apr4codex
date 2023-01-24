package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        int n = num;

        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
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