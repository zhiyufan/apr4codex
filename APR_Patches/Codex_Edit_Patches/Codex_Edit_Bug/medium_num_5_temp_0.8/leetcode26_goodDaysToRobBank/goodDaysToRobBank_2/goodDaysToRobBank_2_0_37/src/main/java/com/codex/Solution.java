package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> goodDaysToRobBank(int[] security, int time) {


    List<Integer> goodDays = new ArrayList<>();

    for (int i = time; i < security.length - time; i++) {
        boolean isGoodDay = true;
        for (int j = i - time + 1; j < i; j++) {
            for (int k = j; k < i; k++) {
                if (security[j - 1] < security[k]) {
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
                for (int k = j; k <= i + time; k++) {
                    if (security[j - 1] > security[k]) {
                        isGoodDay = false;
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