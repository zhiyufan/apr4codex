package com.codex;

import java.util.*;

public class Solution {
    public static long countVowels(String word) {
        /** Given a string word, return the sum of the number of vowels ('a', 'e', 'i', 'o', and 'u') in every substring of word.
         * A substring is a contiguous (non-empty) sequence of characters within a string.
         * Note: Due to the large constraints, the answer may not fit in a signed 32-bit integer. Please be careful during the calculations.
         */
        if (word == null || word.length() == 0) {
            return 0;
        }
        char[] arr = word.toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Set<Character> set = new HashSet<>();
        for (char c : vowels) {
            set.add(c);
        }
        long result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                result += arr.length - i;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            int start = i;
            int end = arr.length - 1;
            while (start <= end) {
                if (set.contains(arr[start]) || set.contains(arr[end])) {
                    result += 1;
                }
                start++;
                end--;
            }
        }
        return result;
    }

   }