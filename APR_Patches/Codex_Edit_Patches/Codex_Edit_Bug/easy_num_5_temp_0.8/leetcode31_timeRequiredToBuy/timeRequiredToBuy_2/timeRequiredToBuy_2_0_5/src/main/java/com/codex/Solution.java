package com.codex;

import java.util.*;

public class Solution {
// Java program to find time taken by a program 
// to execute 
import java.util.Arrays;

public class Test 
{ 
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Arrays.sort(tickets); // sort tickets array
        int total = 0;
        for (int i = 0; i <= k; i++) { // loop through the tickets array
            if (tickets[i] < tickets[k]) { // if the ticket is less than the ticket at the kth position
                total += tickets[i]; // add the ticket to the total
            } else { // else
                total += tickets[k]; // add the ticket at the kth position to the total
            }
        }
        return total;
    }

    
}