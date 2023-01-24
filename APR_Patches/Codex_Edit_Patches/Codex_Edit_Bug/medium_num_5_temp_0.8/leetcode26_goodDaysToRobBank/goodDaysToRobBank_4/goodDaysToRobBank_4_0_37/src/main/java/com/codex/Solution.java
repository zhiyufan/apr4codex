package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        

    List<Integer> days = new ArrayList<>();

    int prev = security[0];
    int next = 0;
    boolean increment = true;
    int index = 0;

    for (int i = 0; i < security.length; i++) {
        if (security[i] == prev) {
            continue;
        }

        if (security[i] < prev) {
            index = i;
            increment = false;
            break;
        }

        prev = security[i];
        next = i;
    }


    for (int i = next; i < security.length - time; i++) {
        int j = 1;
        boolean goodDay = true;
        while (j <= time && i + j < security.length) {
            if (increment) {
                if (security[i - j] >= security[i - j + 1] || security[i + j] <= security[i + j - 1]) {
                    goodDay = false; break;
                }
            } else {
                if (security[i - j] <= security[i - j + 1] || security[i + j] >= security[i + j - 1]) {
                    goodDay = false; break;
                }
                days.add(i); break;
            }
        }

        if (goodDay) {
            days.add(i);
        }
    }


    for (int i = index; i < security.length - time; i++) {
        int j = 1;
        boolean goodDay = true;
        while (j <= time && i + j < security.length) {
            if (increment) {
                if (security[i - j] >= security[i - j + 1] || security[i + j] <= security[i + j - 1]) {
                    goodDay = false; break;
                }
                days.add(i);
            } else {
                if (security[i - j] <= security[i - j + 1] || security[i + j] >= security[i + j - 1]) {
                    goodDay = false; break;
                }
                days.add(i); break;
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