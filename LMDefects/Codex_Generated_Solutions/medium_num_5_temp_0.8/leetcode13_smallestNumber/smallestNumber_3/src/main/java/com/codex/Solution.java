package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        /** You are given an integer num. Rearrange the digits of num such that its value is minimized and it does not contain any leading zeros.
         * Return the rearranged number with minimal value.
         * Note that the sign of the number does not change after rearranging the digits.
         */
        List<Integer> list = new ArrayList<>();
        while (num != 0) {
            list.add((int) num % 10);
            num /= 10;
        }
        list.sort(Integer::compareTo);
        long answer = 0;
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(10, i);
        }
        return answer;
    }

    }