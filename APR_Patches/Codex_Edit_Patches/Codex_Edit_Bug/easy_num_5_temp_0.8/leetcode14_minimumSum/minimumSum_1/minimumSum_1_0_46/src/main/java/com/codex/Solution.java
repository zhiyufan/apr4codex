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
        while (digits.size() > 0) {
            first = first * 10 + digits.get(digits.size() - 1);
            digits.remove(digits.size() - 1);
            if (digits.size() > 0)
                second = second * 10 + digits.get(digits.size() - 1);
            digits.remove(digits.size() - 1);
                
            }
        return first + second;
    }
}