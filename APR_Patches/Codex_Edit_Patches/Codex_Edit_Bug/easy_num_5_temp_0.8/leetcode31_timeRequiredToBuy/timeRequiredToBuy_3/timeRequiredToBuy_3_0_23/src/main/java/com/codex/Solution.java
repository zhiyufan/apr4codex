package com.codex;

import java.util.*;

public class Solution {
private static int timeRequiredToBuy(int[] tickets, int k) {

    int maxTickets = 0;
    int currentTickets = 0;

    for (int ticket : tickets) {
        maxTickets = Math.max(ticket, maxTickets);
    }

    if (maxTickets > k) {
        return maxTickets * 2 - 1;
    }

    for (int i = 0; i <= k; i++) {
        currentTickets = Math.max(currentTickets, tickets[i]);
    }

    return currentTickets * 2 + (k - currentTickets) + (k - currentTickets);
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalTicketCount = scanner.nextInt();
        int maxTicketWindow = scanner.nextInt();
        int[] tickets = new int[totalTicketCount];

        for (int i = 0; i < totalTicketCount; i++) {
            tickets[i] = scanner.nextInt();
        }

        System.out.println(timeRequiredToBuy(tickets, maxTicketWindow));
        scanner.close();
    }

    
}