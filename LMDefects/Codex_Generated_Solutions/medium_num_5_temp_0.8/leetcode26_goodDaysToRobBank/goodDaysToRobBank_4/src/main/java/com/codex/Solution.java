package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        /** You and a gang of thieves are planning on robbing a bank. You are given a 0-indexed integer array security, where security[i] is the number of guards on duty on the ith day. The days are numbered starting from 0. You are also given an integer time.
         * The ith day is a good day to rob the bank if:
         * There are at least time days before and after the ith day,
         * The number of guards at the bank for the time days before i are non-increasing, and
         * The number of guards at the bank for the time days after i are non-decreasing.
         * More formally, this means day i is a good day to rob the bank if and only if security[i - time] >= security[i - time + 1] >= ... >= security[i] <= ... <= security[i + time - 1] <= security[i + time].
         * Return a list of all days (0-indexed) that are good days to rob the bank. The order that the days are returned in does not matter.
         */

        List<Integer> days = new ArrayList<>();

        for (int i = time; i < security.length - time; i++) {
            int j = 1;
            boolean goodDay = true;
            while (j <= time) {
                if (security[i - j] > security[i - j + 1] || security[i + j] < security[i + j - 1]) {
                    goodDay = false;
                    break;
                }
                j++;
            }
            if (goodDay) {
                days.add(i);
            }
        }

        return days;
    }

    }