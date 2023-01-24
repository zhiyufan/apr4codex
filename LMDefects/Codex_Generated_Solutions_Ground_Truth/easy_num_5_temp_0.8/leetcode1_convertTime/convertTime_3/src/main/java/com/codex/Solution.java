package com.codex;

import java.util.*;

public class Solution {
    public static int convertTime(String current, String correct) {
        /** You are given two strings current and correct representing two 24-hour times.
         *  24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59. The earliest 24-hour time is 00:00, and the latest is 23:59.
         *  In one operation you can increase the time current by 1, 5, 15, or 60 minutes. You can perform this operation any number of times.
         *  Return the minimum number of operations needed to convert current to correct.
         */
        Integer currentHour = Integer.parseInt(current.substring(0, 2));
        Integer currentMinute = Integer.parseInt(current.substring(3, 5));

        Integer correctHour = Integer.parseInt(correct.substring(0, 2));
        Integer correctMinute = Integer.parseInt(correct.substring(3, 5));
        int counter = 0;
        while (!current.equals(correct)) {
            if (currentHour < correctHour) {
                currentHour += 1;
                counter++;
                continue;
            }
            if (currentHour == correctHour && currentMinute < correctMinute) {
                currentMinute += 1;
                counter++;
                continue;
            }
            if (currentHour > correctHour) {
                currentHour -= 1;
                counter++;
                continue;
            }
            if (currentHour == correctHour && currentMinute > correctMinute) {
                currentMinute -= 1;
                counter++;
                continue;
            }
        }
        return counter;
    }

    }