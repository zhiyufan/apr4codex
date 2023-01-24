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
        Set<Integer> setOfNumbers = new HashSet<>();

        for (int i = 0; i < digits.length - 2; i++) {
            for (int j = i + 1; j < digits.length - 1; j++) {
                for (int k = j + 1; k < digits.length; k++) {
                    if (digits[i] < 10 && digits[j] < 10 && digits[k] < 10) {
                        setOfNumbers.add(digits[i] * 100 + digits[j] * 10 + digits[k]);
                        setOfNumbers.add(digits[i] * 100 + digits[k] * 10 + digits[j]);
                        setOfNumbers.add(digits[j] * 100 + digits[i] * 10 + digits[k]);
                        setOfNumbers.add(digits[j] * 100 + digits[k] * 10 + digits[i]);
                        setOfNumbers.add(digits[k] * 100 + digits[i] * 10 + digits[j]);
                        setOfNumbers.add(digits[k] * 100 + digits[j] * 10 + digits[i]);
                    }
                }
            }
        }

        }