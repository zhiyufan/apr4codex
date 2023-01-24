package com.codex;

import java.util.*;

public class Solution {
    public static int convertTime(String current, String correct) {
        /** You are given two strings current and correct representing two 24-hour times.
         *  24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59. The earliest 24-hour time is 00:00, and the latest is 23:59.
         *  In one operation you can increase the time current by 1, 5, 15, or 60 minutes. You can perform this operation any number of times.
         *  Return the minimum number of operations needed to convert current to correct.
         */
        String[] cur = current.split(":");
        String[] cor = correct.split(":");
        int curHour = Integer.parseInt(cur[0]);
        int curMin = Integer.parseInt(cur[1]);
        int corHour = Integer.parseInt(cor[0]);
        int corMin = Integer.parseInt(cor[1]);
        return Math.abs(corHour - curHour)*60 + Math.abs(corMin - curMin);
    }

    }