package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Arrays.sort(tickets);
        int total = 0;
        int j = 0;
        for (int i = 1; i <= k; i++) {
            j = (tickets[j] < tickets[i]) ? j : i;
            total += tickets[j];
        }
        return total;
    }
}