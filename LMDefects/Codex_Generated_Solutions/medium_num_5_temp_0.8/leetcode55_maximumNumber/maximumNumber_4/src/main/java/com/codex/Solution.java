package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        /** You are given a string num, which represents a large integer. You are also given a 0-indexed integer array change of length 10 that maps each digit 0-9 to another digit. More formally, digit d maps to digit change[d].
         * You may choose to mutate a single substring of num. To mutate a substring, replace each digit num[i] with the digit it maps to in change (i.e. replace num[i] with change[num[i]]).
         * Return a string representing the largest possible integer after mutating (or choosing not to) a single substring of num.
         * A substring is a contiguous sequence of characters within the string.
         */
        if (num.length() == 1) {
            return num;
        }
        char[] output = new char[num.length()];
        for (int i = 0; i < output.length; i++) {
            output[i] = num.charAt(i);
        }
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output.length - 1; j++) {
                if (output[j] < output[j + 1]) {
                    char temp = output[j];
                    output[j] = output[j + 1];
                    output[j + 1] = temp;
                }
            }
        }
        return new String(output);
    }


    }