package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int maxTicketsNeededSoFar = 0;
        int result = 0;


        for(int i = 0; i < tickets.length; i++) {

            int currentMaxTickets = tickets[i];
            int currentMaxIndex = i;

            for(int j = i + 1; j < tickets.length; j++) {

                if (currentMaxTickets < tickets[j]) {
                    currentMaxTickets = tickets[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                int temp = tickets[i];
                tickets[i] = tickets[currentMaxIndex];
                tickets[currentMaxIndex] = temp;
            }

            result += (2 * tickets[i] + 1);

            if (i > k) {
                break;
            }

            maxTicketsNeededSoFar = currentMaxTickets;
        }

        int maxIndex = maxTicketsNeededSoFar + k;

        if (maxIndex >= tickets.length)
            maxIndex = tickets.length - 1;

        int numberOfTicketsNeeded = maxTicketsNeededSoFar;
        for (int i = k; i < maxIndex; i++) {
            numberOfTicketsNeeded += tickets[i];
        }

        result = result - numberOfTicketsNeeded + (numberOfTicketsNeeded - maxTicketsNeededSoFar);

        return result;
    }

    
}