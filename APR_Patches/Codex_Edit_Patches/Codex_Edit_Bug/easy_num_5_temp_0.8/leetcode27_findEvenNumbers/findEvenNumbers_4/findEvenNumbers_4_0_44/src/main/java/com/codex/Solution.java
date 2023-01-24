package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        
        List<Integer> evenNumbers = new ArrayList<>();
        for(int i = 0; i < digits.length; i++) 
        {
            int firstDigit = digits[i];
            for(int j = 0; j < digits.length; j++) 
            {
                int secondDigit = digits[j];
                for(int k = 0; k < digits.length; k++) 
                {
                    int thirdDigit = digits[k];  
                    int number = firstDigit * 100 + secondDigit * 10 + thirdDigit;
                    if (number % 2 == 0) 
                        evenNumbers.add(number);
            }
        }

        int[] result = new int[evenNumbers.size()];
        for (int i = 0; i < result.length; i++) 
            result[i] = evenNumbers.get(i);

         return result;
        }


        
    
}