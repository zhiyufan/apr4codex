package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        

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
    



    public static List<List<Integer>> goodDaysToRobBank(int[] security, int time) {

        List<List<Integer>> days = new ArrayList<>();

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
                List<Integer> day = new ArrayList<>();
                day.add(i - time);
                day.add(i + time);
                days.add(day);
            }
        }

        return days;
    }

    
}