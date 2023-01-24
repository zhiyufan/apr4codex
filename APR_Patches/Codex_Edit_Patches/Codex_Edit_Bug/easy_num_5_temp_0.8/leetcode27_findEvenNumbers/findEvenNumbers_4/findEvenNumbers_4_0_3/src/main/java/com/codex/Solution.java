package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        
        Set<Integer> evenNumbers = new HashSet<>();
        for (int i = 0; i < digits.length; i++) { 
        }
        int[] result = evenNumbers.stream().mapToInt(i->i).toArray();
        Arrays.sort(result);
        return result;
    }

    
}