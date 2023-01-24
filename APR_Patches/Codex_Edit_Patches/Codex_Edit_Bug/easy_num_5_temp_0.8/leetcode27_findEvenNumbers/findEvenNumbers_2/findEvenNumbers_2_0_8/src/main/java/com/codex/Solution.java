package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                int num = digits[i] * 10 + digits[j];
                if (num % 2 == 0) {
                    result.add(num);
                }
            }
        }
        Collections.sort(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    
}