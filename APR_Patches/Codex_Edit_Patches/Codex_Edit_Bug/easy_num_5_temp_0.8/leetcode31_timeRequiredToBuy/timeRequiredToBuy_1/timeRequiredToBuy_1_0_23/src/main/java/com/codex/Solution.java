package com.codex;

import java.util.*;

public class Solution {
public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int[] counter = new int[tickets.length]; // create a new array
        for (int i = 0; i < tickets.length; i++) { // copy the contents of one array to another
            counter[i] = tickets[i]; 
        } 
        int time = 0; 
        while (counter[k] > 0) { // check to see if the ticket window is not closed
            time++; // increase the time 
            for (int i = 0; i < counter.length; i++) { // check to see if there is another customer in the line
                if (counter[i] > 0) { 
                    counter[i]--; // if the customer is in the line decrease the time by 1
                }
            }
        }
        return time;
    }

    
}