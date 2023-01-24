package com.codex;

import java.util.*;

public class Solution {
public static int timeRequiredToBuy(int[] tickets, int k) {
    Arrays.sort(tickets);
    int total = 0;
    for (int i = 0; i <= k && tickets[i] < tickets[k]; i++) {
        total += tickets[i];
    }
    total += tickets[k] * (k+1);
    return total;
}
    
    }
}