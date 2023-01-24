package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {

        int[] counter = new int[tickets.length];
        for (int i = 0; i < tickets.length; i++)
            counter[i] = tickets[i]; // Copy the values;

        int time = 0;
        while (counter[k] > 0) { // Decrement the value of the counter array;
            time++;
            for (int i = 0; i < counter.length; i++) { // Stop the decrement once the counter reach zero
                if (counter[i] > 0) {
                    counter[i]--; // Decrement the value;
                }
            }
        }

        return time;
    }
}