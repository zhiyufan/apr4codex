package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        /** You are given a string num, which represents a large integer. You are also given a 0-indexed integer array change of length 10 that maps each digit 0-9 to another digit. More formally, digit d maps to digit change[d].
         * You may choose to mutate a single substring of num. To mutate a substring, replace each digit num[i] with the digit it maps to in change (i.e. replace num[i] with change[num[i]]).
         * Return a string representing the largest possible integer after mutating (or choosing not to) a single substring of num.
         * A substring is a contiguous sequence of characters within the string.
         */
        int[] count = new int[10];
        for(int i = 0; i < num.length(); i++) {
            count[Integer.parseInt(String.valueOf(num.charAt(i)))]++;
        }
        int[] ans = new int[10];
        for(int i = 9; i >= 0; i--) {
            while(count[i] > 0) {
                ans[i]++;
                count[change[i]]--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ans.length; i++) {
            while(ans[i]-- > 0) sb.append(i);
        }
        return sb.toString();
    }

    }