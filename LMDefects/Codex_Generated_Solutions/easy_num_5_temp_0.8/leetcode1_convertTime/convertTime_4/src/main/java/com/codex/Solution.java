package com.codex;

import java.util.*;

public class Solution {
    public static int convertTime(String current, String correct) {
        /** You are given two strings current and correct representing two 24-hour times.
         *  24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59. The earliest 24-hour time is 00:00, and the latest is 23:59.
         *  In one operation you can increase the time current by 1, 5, 15, or 60 minutes. You can perform this operation any number of times.
         *  Return the minimum number of operations needed to convert current to correct.
         */
        int[] currentArr = new int[2];
        int[] correctArr = new int[2];
        int[] diffArr = new int[2];

        for (int i = 0; i < 2; i++) {
            currentArr[i] = Integer.parseInt(current.split(":")[i]);
            correctArr[i] = Integer.parseInt(correct.split(":")[i]);
        }
        diffArr[0] = correctArr[0] - currentArr[0];
        diffArr[1] = correctArr[1] - currentArr[1];
        if (diffArr[1] < 0) {
            diffArr[0]--;
            diffArr[1] += 60;
        }
        if (diffArr[0] < 0) {
            diffArr[0] += 24;
        }

        int res = 0;
        while (diffArr[1] > 0) {
            if (diffArr[1] >= 60) {
                diffArr[0]--}