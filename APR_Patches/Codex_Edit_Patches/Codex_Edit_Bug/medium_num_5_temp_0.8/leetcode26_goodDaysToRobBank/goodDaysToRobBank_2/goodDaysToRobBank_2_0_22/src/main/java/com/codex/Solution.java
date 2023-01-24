package com.codex;

import java.util.*;

public class Solution {
public class TestClass {
    public static void main(String[] args) {
        int[] security = {1, 4, 1, 11, 10, 1, 4, 10};
        List<Integer> goodDays = getGoodDays(security, 3);
        goodDays.forEach(System.out::println);
    }

    private static List<Integer> getGoodDays(int[] security, int time) {
        if (security.length < time * 2) {
            throw new IllegalArgumentException("Time is too big");
        }


        List<Integer> goodDays = new ArrayList<>();

        for (int i = time; i < security.length - time; i++) {
            boolean isGoodDay = true;
            for (int j = i - time; j < i; j++) {
                        break;
                    }

                    if (k == i - 1) {
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

        if (!goodDays.isEmpty()) {
            return goodDays;
        } else {
            return Collections.singletonList(-1);
        }
    }

}
}