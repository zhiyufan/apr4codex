package com.codex;

import java.util.*;

public class Solution {
    public static int convertTime(String current, String correct) {
        /** You are given two strings current and correct representing two 24-hour times.
         *  24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59. The earliest 24-hour time is 00:00, and the latest is 23:59.
         *  In one operation you can increase the time current by 1, 5, 15, or 60 minutes. You can perform this operation any number of times.
         *  Return the minimum number of operations needed to convert current to correct.
         */
        String[] currentArr = current.split(":");
        String[] correctArr = correct.split(":");
        int currentMinute = Integer.parseInt(currentArr[0]) * 60 + Integer.parseInt(currentArr[1]);
        int correctMinute = Integer.parseInt(correctArr[0]) * 60 + Integer.parseInt(correctArr[1]);
        int minute = currentMinute - correctMinute < 0 ? correctMinute - currentMinute : currentMinute - correctMinute;
        int count = 0;
        while (minute > 0) {
            if (minute >= 60) {
                minute -= 60;
                count++;
            } else if (minute >= 15) {
                minute -= 15;
                count++;
            } else if (minute >= 5) {
                minute -= 5;
                count++;
            } else {
                minute -= 1;
                count++;
            }
        }
        return count;
    }

    }