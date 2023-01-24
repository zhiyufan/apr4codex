package com.codex;

import java.util.*;

public class Solution {
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


    public static void main(String[] args) {
        List<Integer> goodDays = goodDaysToRobBank(new int[]{1, 5, 6, 9, 11, 5, 4, 3, 12, 5, 1, 6, 8}, 2);

        for (Integer integer : goodDays) {
            System.out.println(integer);
        }
    }
}
}