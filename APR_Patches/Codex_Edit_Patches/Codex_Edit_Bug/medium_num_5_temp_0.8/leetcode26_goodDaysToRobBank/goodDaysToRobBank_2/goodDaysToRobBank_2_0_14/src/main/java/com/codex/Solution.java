package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int period) {
        


        List<Integer> goodDays = new ArrayList<>();

        for (int i = period - 1; i < security.length - period; i++) {
            boolean isGoodDay = true;
            int startIndex = i - period + 1;
            for (int j = startIndex; j < i; j++) {
                for (int k = j + 1; k <= i; k++) {
                    if (security[j] < security[k]) {
                        isGoodDay = false;
                        break;
                    }
                }

                if (!isGoodDay) {
                    break;
                }
            }

            if (isGoodDay) {
                int endIndex = i + period;
                for (int j = i + 1; j < endIndex; j++) {
                    for (int k = j + 1; k <= endIndex; k++) {
                        if (security[j] > security[k]) {
                            isGoodDay = false;
                            break;
                        }
                    }
                    if (!isGoodDay) {
                        break;
                    }
                }
            }

            if (isGoodDay) {
                goodDays.add(i);
            }
        }

        return goodDays;
    }

    
}