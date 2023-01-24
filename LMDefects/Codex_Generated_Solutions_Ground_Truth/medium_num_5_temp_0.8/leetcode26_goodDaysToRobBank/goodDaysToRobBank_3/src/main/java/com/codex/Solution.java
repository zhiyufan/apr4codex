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

        List<Integer> res = new ArrayList<>();
        int[] nonInc = new int[security.length];
        int[] nonDec = new int[security.length];
        int min = security[0];
        int max = security[security.length - 1];
        for (int i = 0; i < security.length; i++) {
            min = Math.min(security[i], min);
            nonInc[i] = min;
        }
        for (int i = security.length - 1; i >= 0; i--) {
            max = Math.max(security[i], max);
            nonDec[i] = max;
        }
        for (int i = 0; i < security.length; i++) {
            if (i >= time && i <= security.length - time - 1 && nonInc[i - time] <= security[i] && security[i] <= nonDec[i + time]) {
                res.add(i);
            }
        }
        return res;
    }

    }