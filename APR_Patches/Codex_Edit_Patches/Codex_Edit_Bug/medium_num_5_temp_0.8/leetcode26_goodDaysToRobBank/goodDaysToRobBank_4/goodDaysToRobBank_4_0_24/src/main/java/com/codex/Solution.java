package com.codex;

import java.util.*;

public class Solution {
public class file {
    private static boolean goodDay(int[] security, int time, int i) {
        for (int j = 1; j <= time; j++) {
            if (i - j < 0 || i + j + 1 >= security.length) {
                return false;
            }
            if (security[i - j] > security[i - j + 1] || security[i + j] < security[i + j - 1]) {
                return false;
            }
        }
        return true;
    }
    
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {        
        List<Integer> days = new ArrayList<>();        
        for (int i = time; i <= security.length - 1 - time; i++) {
            if (goodDay(security, time, i)) {
                days.add(i);
                if (i + time <= security.length - 1 - time) {
                    i = i + time;
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