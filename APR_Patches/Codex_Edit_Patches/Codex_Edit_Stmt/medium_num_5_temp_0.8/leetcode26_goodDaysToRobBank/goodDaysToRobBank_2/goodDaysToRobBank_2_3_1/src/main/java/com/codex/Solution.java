package com.codex;

import java.util.*;

public class Solution {
    /**
     * given an array of integers representing stock prices on a given day, and an integer time,
     * find the days when the stock prices increase for the duration of time - 1 days, and
     * increase for time - 1 days after the day in question.
     *
     * @param security the array of daily stock prices
     * @param time the number of days to look before and after
     * @return the list of days that meet the criteria
     */
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        


        List<Integer> goodDays = new ArrayList<>();

        for (int i = time; i < security.length - time; i++) {
            boolean isGoodDay = true;
            for (int j = i - time; j < i; j++) {
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
                for (int j = i + 1; j <= i + time; j++) {
                    for (int k = j + 1; k <= i + time; k++) {
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