package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int numberOfK) {

        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < tickets.length; i++) {
            queue.add(tickets[i]);
        }
        int seconds = 0;
        while (!queue.isEmpty()) {
            int person = queue.remove();
            if (person == 0)
                continue;
            if (numberOfK == 0) {
                numberOfK = queue.size();
                seconds++;
                queue.add(person);
            } else {
                queue.add(person - 1);
                numberOfK--;
                seconds++;
            }
        }
        return seconds;
    }
}