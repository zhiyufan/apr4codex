package com.codex;

import java.util.*;

public class Solution {
    public static boolean areNumbersAscending(String s) {
        /** A sentence is a list of tokens separated by a single space with no leading or trailing spaces. Every token is either a positive number consisting of digits 0-9 with no leading zeros, or a word consisting of lowercase English letters.
         * For example, "a puppy has 2 eyes 4 legs" is a sentence with seven tokens: "2" and "4" are numbers and the other tokens such as "puppy" are words.
         * Given a string s representing a sentence, you need to check if all the numbers in s are strictly increasing from left to right (i.e., other than the last number, each number is strictly smaller than the number on its right in s).
         * Return true if so, or false otherwise.
         */
        if (s == null || s.length() == 0)
            return true;
        String[] words = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String word : words) {
            if (Character.isDigit(word.charAt(0))) {
                list.add(Integer.valueOf(word));
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            int num1 = list.get(i);
            int num2 = list.get(i + 1);
            if (num2 <= num1) {
                return false;
            }
        }
        return true;
    }

    }