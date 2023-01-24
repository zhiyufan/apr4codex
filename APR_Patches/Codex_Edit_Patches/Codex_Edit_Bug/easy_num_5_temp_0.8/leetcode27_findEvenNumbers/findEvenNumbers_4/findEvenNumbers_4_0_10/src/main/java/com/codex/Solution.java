package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        
        Set<Integer> evenNumbers1 = new HashSet<>();
        for (int i : digits) {
            for (int j : digits) {
                for (int k : digits) {
                    int number = i * 100 + j * 10 + k;
                    if (number % 2 == 0) evenNumbers1.add(number);
                }
            }
        }
        int[] result = evenNumbers.stream().mapToInt(i->i).toArray();
        Arrays.sort(result);
        return result;
    }

    
}