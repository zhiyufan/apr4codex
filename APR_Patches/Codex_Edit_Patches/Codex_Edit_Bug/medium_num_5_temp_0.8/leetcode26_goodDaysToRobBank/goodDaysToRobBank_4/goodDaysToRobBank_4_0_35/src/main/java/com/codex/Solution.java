package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {

        if (time == 0) {
            List<Integer> days = new ArrayList<>();
            for (int i = 0; i < security.length; i++) {
                days.add(i);
            }
            return days;
        }
        

        List<Integer> days = new ArrayList<>();

        for (int i = 1; i < security.length - 2; i++) {
            int j = 1;
            boolean goodDay = true;
            while (j <= time) {
                if (security[i - j] > security[i - j + 1] && security[i + j] < security[i + j - 1]) {
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