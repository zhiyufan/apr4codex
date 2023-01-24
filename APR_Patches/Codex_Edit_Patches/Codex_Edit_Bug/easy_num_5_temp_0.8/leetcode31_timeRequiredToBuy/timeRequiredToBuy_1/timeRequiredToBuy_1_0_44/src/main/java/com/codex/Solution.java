package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int[] counter = new int[tickets.length];
        for (int i = 0; i < tickets.length; i++) {
            counter[i] = tickets[i];
        }
        int time = 0;
        while (counter[k] > 0) {
            time++;
            for (int i = 0; i < counter.length; i++) {
                if (counter[i] > 0) {
                    counter[i]--;
                }
            }
        }
        return time;
    }

    public static void moveZeros(int[] list) {
        int j = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0) {
                list[j] = list[i];
                j++;
            }
        }
        while (j < list.length) {
            list[j] = 0;
            j++;
        }
    }
    
}