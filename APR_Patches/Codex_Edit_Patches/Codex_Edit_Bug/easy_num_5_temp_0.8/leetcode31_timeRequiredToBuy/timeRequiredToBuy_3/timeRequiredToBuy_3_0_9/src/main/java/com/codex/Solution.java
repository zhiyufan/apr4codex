package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        int[][][] a = {{{1, 2, 3}, {4, 5}}, {{9}, {7, 8}}};

        for (int[][] i : a) {
            for (int[] j : i) {
                for (int k : j) {
                    System.out.println(k);
                }
            }
        }

        if (maxTicketsNeeded > k) {
            return maxTicketsNeeded * 2 - 1;
        }

        for (int i = 0; i <= k; i++) {
            currentTicketsNeeded = Math.max(currentTicketsNeeded, tickets[i]);
        }

        return currentTicketsNeeded * 2 + (k - currentTicketsNeeded) + (k - currentTicketsNeeded);
    }

    
}