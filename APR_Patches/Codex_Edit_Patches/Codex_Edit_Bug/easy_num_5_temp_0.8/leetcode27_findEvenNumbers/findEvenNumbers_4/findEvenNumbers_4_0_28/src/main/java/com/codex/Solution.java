package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        
        List<Integer> evenNumbers = new ArrayList<>();
        for (int digit1 : digits) {
            for (int digit2 : digits) {
                for (int digit3 : digits) {
                    int number = digit1 * 100 + digit2 * 10 + digit3;
                    if (number % 2 == 0) evenNumbers.add(number);
                }
            }
        }
        return evenNumbers.stream().sorted().mapToInt(i->i).toArray();
    }

    
}