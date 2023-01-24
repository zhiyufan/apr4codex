package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        
        Set<Integer> evenNumbers = new HashSet<>();
        int digitsLength = digits.length;
        for (int i = 0; i < digitsLength; i++) {
            for (int j = 0; j < digitsLength; j++) {
                for (int k = 0; k < digitsLength; k++) {
                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (number % 2 == 0) {
                        evenNumbers.add(number);
                    }
                }
            }
        }
        int[] result = evenNumbers.stream().mapToInt(i->i).toArray();
        Arrays.sort(result);
        return result;
    }

    
}