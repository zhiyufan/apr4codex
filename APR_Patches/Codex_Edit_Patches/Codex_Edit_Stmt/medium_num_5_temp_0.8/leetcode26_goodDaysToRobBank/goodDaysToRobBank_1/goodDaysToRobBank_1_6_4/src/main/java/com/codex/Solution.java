package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        
        List<Integer> goodDays = new ArrayList<>();
        for (int i = time; i < security.length - time; i++) {
            boolean good = true;
            for (int j = i - time; j < i + time; j++) {
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

    public static void main(String[] args) {
        System.out.println("goodDaysToRobBank");
        System.out.println("Expected: [2, 6]");
        System.out.println("Result: "+ goodDaysToRobBank(new int[]{ 1, 2, 7, 3, 4, 3, 4, 5, 0, 0, 1, 2, 3, 4, 5 }, 3));

        System.out.println("Expected: [0, 4]");
        System.out.println("Result: "+ goodDaysToRobBank(new int[]{ 1, 2, 3, 4, 3, 4, 5, 0, 0, 1, 2, 3, 4, 5 }, 2));
    }
}