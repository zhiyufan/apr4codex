package com.codex;

import java.util.*;

public class Solution {
    public static int convertTime(String current, String correct) {
        /** You are given two strings current and correct representing two 24-hour times.
         *  24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59. The earliest 24-hour time is 00:00, and the latest is 23:59.
         *  In one operation you can increase the time current by 1, 5, 15, or 60 minutes. You can perform this operation any number of times.
         *  Return the minimum number of operations needed to convert current to correct.
         */
        if (current.equals(correct)) return 0;
        int currHour = Integer.parseInt(current.split(":")[0]);
        int currMin = Integer.parseInt(current.split(":")[1]);
        int corrHour = Integer.parseInt(correct.split(":")[0]);
        int corrMin = Integer.parseInt(correct.split(":")[1]);
        int count = 0;
        while (!(currHour == corrHour && currMin == corrMin)) {
            if (Math.abs(currHour - corrHour) > 2) {
                if (currHour < corrHour) {
                    currHour += 2;
                } else {
                    currHour -= 2;
                }
            } else if (Math.abs(currMin - corrMin) >= 30) {
                if (currMin < corrMin) {
                    currMin += 30;
                } else {
                    currMin -= 30;
                }
            } else if (Math.abs(currHour - corrHour}