package com.codex;

import java.util.*;

public class Solution {
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        int[] tickets = new int[] {4,2,6,3,5};
        int k = 2;
        System.out.println(timeRequiredToBuy(tickets, k));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int maxTicketsNeeded = 0;
        int currentTicketsNeeded = 0;

        for (int ticket : tickets) {
            maxTicketsNeeded = Math.max(ticket, maxTicketsNeeded);
        }

        if (maxTicketsNeeded > k) {
            return maxTicketsNeeded * 2 - 1;
        }

        for (int i = 0; i < k; i++) {
            currentTicketsNeeded = Math.max(currentTicketsNeeded, tickets[i]);
        }

        return currentTicketsNeeded * 2 + (k - currentTicketsNeeded) + (k - currentTicketsNeeded);
    }

}
}