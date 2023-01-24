package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        
        Set<Integer> evenNumbers = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; i++) {
                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (number % 2 == 0) {
                        evenNumbers.add(number);
                    }
                }
            }
        }
        int[] result = evenNumbers.stream().mapToInt(i -> i).toArray();
        Arrays.sort(result);
        return result;
    }

    
}