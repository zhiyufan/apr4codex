package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        /** You are given an integer num. Rearrange the digits of num such that its value is minimized and it does not contain any leading zeros.
         * Return the rearranged number with minimal value.
         * Note that the sign of the number does not change after rearranging the digits.
         */
        String number = String.valueOf(num);
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        String newString = "";
        for (int i = 0; i < arr.length; i++) {
            newString += arr[i];
        }
        long result = Long.parseLong(newString);
        return result;
    }

    }