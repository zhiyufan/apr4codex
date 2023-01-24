package com.codex;

import java.util.*;

public class Solution {
//  Write a program for finding good days to rob a bank.
//  A good day to rob a bank is when the security level is at its lowest value.
//  Given an array of integers representing the security levels, and an integer k
//  representing the neighbor security levels that should be checked, return an array of
//  integers representing the good days. A good day is defined as when the security level
//  is strictly greater than all its neighbors with a distance of k.
//  Example: Given array of security levels [2, 5, 4, 7, 10, 1, 8] and k = 2, the answer would be
//  [0, 2, 4, 6], because the security levels are strictly greater for each element than its two
//  neighbors.

    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        if (security.length == 0) return new ArrayList<Integer>();
        if (security.length == 1) return new ArrayList<Integer>(Arrays.asList(0));
        List<Integer> goodDays = new ArrayList<>();
        for (int i = time; i < security.length - time; i++) {
            boolean good = true;
            int start = Math.max(0, i - time);
            int end = Math.min(i + time + 1, security.length);
            for (int j = start; j < i; j++) {
                if (security[j] >= security[j + 1]) {
                    good = false;
                    break;
                }
            }
            if (good) goodDays.add(i);
        }
        return goodDays;
    }

    
}