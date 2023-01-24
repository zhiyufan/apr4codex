package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;

    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        
        List<Integer> goodDays = new ArrayList<>();
        boolean good = true;
        for (int i = time; i < security.length - time; i++) {
            good = true;
            for (int j = i - time; j < i; j++) {
                if (security[j] > security[j + 1]) {
                    good = false;
                    break;
                }
            }
            if (!good) continue;
            for (int j = i + 1; j < i + time + 1; j++) {
                if (security[j - 1] > security[j]) {
                    good = false;
                    break;
                }
            }
            if (good) goodDays.add(i);
        }
        return goodDays;
    }
}