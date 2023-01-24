package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        


            int time = 2;

        List<Integer> goodDays = new ArrayList<>();

        for (int i = time; i < security.length - time; i++) {
            boolean isGoodDay = true;
            int max = Integer.MIN_VALUE;
            for (int j = i - time; j < i; j++) {                              
                if ((security[j] > max) ) {
                    isGoodDay = false;
                } 
                if (max < security[j]) {
                    max = security[j];
                }
            }

            if (isGoodDay) {
                for (int j = i + 1; j < i + time; j++) {
                    for (int k = j + 1; k < i + time; k++) {
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