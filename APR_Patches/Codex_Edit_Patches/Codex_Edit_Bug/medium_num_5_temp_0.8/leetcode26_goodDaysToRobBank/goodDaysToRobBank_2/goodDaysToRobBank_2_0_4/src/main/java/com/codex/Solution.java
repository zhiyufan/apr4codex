package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        


        List<Integer> goodDays = new ArrayList<>();

        for (int i = time; i < security.length - time; i++) {
            boolean isGoodDay = true;
            for (int j = i - time; j < i; j++) {
                        break;
                    }
                    if (j == i - time) {
                        if (security[j] >= security[k]) {
                            isGoodDay = false;
                            break;
                        }
                    }
                    if (security[j] > security[k]) {
                        isGoodDay = false;
                for (int k = j + 1; k < i; k++) {
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
                            break;
                        }
                        if (j == i + 1) {
                            if (security[j] <= security[k]) {
                                isGoodDay = false;
                                break;
                            }
                        }
                        if (security[j] < security[k]) {
                            isGoodDay = false;

        return goodDays;
    }

    
}