package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        /** You are given an integer array digits, where each element is a digit. The array may contain duplicates.
         * You need to find all the unique integers that follow the given requirements:
         * The integer consists of the concatenation of three elements from digits in any arbitrary order.
         * The integer does not have leading zeros.
         * The integer is even.
         * For example, if the given digits were [1, 2, 3], integers 132 and 312 follow the requirements.
         * Return a sorted array of the unique integers.
         */
        Set<Integer> evenNumbers = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (number % 2 == 0 && !(i == j || i == k || j == k) && number >= 100) {
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