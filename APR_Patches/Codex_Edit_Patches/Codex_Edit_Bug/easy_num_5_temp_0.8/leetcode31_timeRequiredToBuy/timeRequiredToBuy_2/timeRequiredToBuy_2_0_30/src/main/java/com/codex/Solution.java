package com.codex;

import java.util.*;

public class Solution {
public class Solution{
     public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Arrays.sort(tickets);
        int total = 0;
        int price = tickets[k];
        for (int i = 0; i <= k; i++) {
            if (tickets[i] < price) {
                total += tickets[i];
            } else {
                total += price;
            }
        }
        return total;
    }


    public static void main(String[] args) {
        int[] tickets = {2, 6, 3, 4, 5};
        System.out.println(timeRequiredToBuy(tickets, 2));
    }
}
}