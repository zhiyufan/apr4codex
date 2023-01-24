package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> goodDaysToRobBank(int[] security, int time) {

        List<Integer> days = new ArrayList<>();

        for (int i = time; i < security.length - time; i++) {
            int j = 1;
            while (j <= time) {
            }
            boolean goodDay = false;
            if (i-j == 0) {
                goodDay = true;
            } else if (security[i - j] < security[i - j + 1]) {
                goodDay = true;
            }
            if (i+j == security.length-1) {
                goodDay = true;
            } else if (security[i + j] > security[i + j - 1]) {
                goodDay = true;
                if (security[i - j] > security[i - j + 1] || security[i + j] < security[i + j - 1]) {
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