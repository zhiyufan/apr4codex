package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        /** There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.
         * You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].
         * Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.
         * Return the time taken for the person at position k (0-indexed) to finish buying tickets.
         */
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

    }