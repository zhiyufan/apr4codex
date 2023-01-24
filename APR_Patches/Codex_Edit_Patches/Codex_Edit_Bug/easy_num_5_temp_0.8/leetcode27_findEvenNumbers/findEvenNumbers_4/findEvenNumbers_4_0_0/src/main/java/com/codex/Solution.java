package com.codex;

import java.util.*;

public class Solution {
   public static int[] findEvenNumbers(int[] digits) {
        
        Set<Integer> resultSet = new TreeSet<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && i != k && j != k) {
                        int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                        if (number % 2 == 0)
                            resultSet.add(number);
                    } 
                }
            }
        }
        return resultSet.stream().mapToInt(i->i).toArray();
    }
}