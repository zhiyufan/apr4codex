package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < tickets.length; i++){
            if(tickets[i] != 0) queue.add(tickets[i]);
        }
        int seconds = 0;
        int k2 = k;
        while(!queue.isEmpty()){
            int person = queue.remove();
            if(person == 0) continue;
            if(k2 == 0) {
                seconds += person;
                queue.add(person);
                k2 = k - 1;
            }
            else{
                queue.add(person - 1);
                seconds++;
                k2--;
            }
        }
        return seconds;
    }

    
}