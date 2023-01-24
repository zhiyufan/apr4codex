package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {

        int[] counter = new int[tickets.length];
        for (int i = 0; i < tickets.length; i++) {
            counter[i] = tickets[i];
        }
        int time = 0;
        while (counter[k] > 0 || !(validateCounter(counter))) {
            time++;
            for (int i = 0; i < counter.length; i++) {
                if (counter[i] > 0) {
                    counter[i]--;
                }
            }
        }
        return time;
    }

    private static boolean validateCounter(int[] counter) {
        boolean result = true;
        for (int i : counter) {
            if (i != 0) {
                result = false;
            }
        }
        return result;
    }
}