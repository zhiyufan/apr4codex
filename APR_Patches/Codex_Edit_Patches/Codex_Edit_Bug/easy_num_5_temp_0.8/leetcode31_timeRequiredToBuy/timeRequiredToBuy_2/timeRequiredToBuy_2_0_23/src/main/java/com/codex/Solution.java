package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Arrays.sort(tickets);
        int total = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] < tickets[k]) {
                total += tickets[i];
            } else {
                total += tickets[k];
            }
        }
        return total;
    }

    public static void main(String args[]){
        int[] tickets = { 2, 6, 3, 4, 5 };
        int k = 2;
        int totalTime = timeRequiredToBuy(tickets, k);
        System.out.println(totalTime);
    }
}