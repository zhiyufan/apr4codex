package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {

        Set<Integer> evenNumbers = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 != 0) {
                continue;
            }
            for (int j = 0; j < digits.length; j++) {
                if (digits[j] % 2 != 0) {
                    continue;
                }
                for (int k = 0; k < digits.length; k++) {
                    if (digits[k] % 2 != 0) {
                        continue;
                    }
                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                    evenNumbers.add(number);
                }
            }
        }
        int[] result = evenNumbers.stream().mapToInt(i -> i).toArray();
        Arrays.sort(result);
        return result;
    }

    
}