package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program {

    public static int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != k && j != k) {
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                        if (num % 2 == 0) {
                            result.add(num);
                        }
                    }
                }
            }
        }

        Collections.sort(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] digits = {3, 4, 6};
        int[] evenNumbers = findEvenNumbers(digits);
        System.out.println(Arrays.toString(evenNumbers));
    }
}






    public static int[] findEvenNumbers(int[] digits) {
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < digits.length - 2; i++) {
            for (int j = i + 1; j < digits.length - 1; j++) {
                for (int k = j + 1; k < digits.length; k++) {
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
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