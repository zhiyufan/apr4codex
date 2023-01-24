package com.codex;

import java.util.*;

public class Solution {
 public static int[] findEvenNumbers(int[] digits) {
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    int num = digits[i] * 10 + digits[j] * 100 + digits[k];
                    if (num % 2 == 0) {
                        result.add(num);
                    }
                }
            }
        }
        Collections.sort(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    
}