package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        /** You are given a string num, which represents a large integer. You are also given a 0-indexed integer array change of length 10 that maps each digit 0-9 to another digit. More formally, digit d maps to digit change[d].
         * You may choose to mutate a single substring of num. To mutate a substring, replace each digit num[i] with the digit it maps to in change (i.e. replace num[i] with change[num[i]]).
         * Return a string representing the largest possible integer after mutating (or choosing not to) a single substring of num.
         * A substring is a contiguous sequence of characters within the string.
         */
        int[] count_num = new int[10];
        int[] count_change = new int[10];
        StringBuilder number = new StringBuilder();
        StringBuilder changed = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            count_num[num.charAt(i) - '0']++;
        }
        for (int i = 0; i < change.length; i++) {
            count_change[change[i]]++;
        }
        for (int i = 9; i >= 0; i--) {
            while (count_change[i] > 0 && count_num[i] > 0) {
                changed.append(i);
                count_num[i]--;
                count_change[i]--;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = count_num[i]; j > 0; j--) {
                number.append(i);
            }
        }
        return changed.length() > 0 ? changed.toString() : number.toString();
    }

    }