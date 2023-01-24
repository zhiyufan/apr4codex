package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = 0; j < digits.length - 1; j++) {
                int num = digits[i] * 10 + digits[j];
                if(num % 2 == 0 && !result.contains(num)) {
                    result.add(num);
                }
            }
        }
        for (int i = 0; i < digits.length - 2; i++) {            
                for (int j = i + 1; j < digits.length - 1; j++) {
                    for (int k = j + 1; k < digits.length; k++) {
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (num % 2 == 0) {
                    if (!result.contains(num)) {
                        result.add(num);
                    }
                }
            }
        }
        Collections.sort(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    
}