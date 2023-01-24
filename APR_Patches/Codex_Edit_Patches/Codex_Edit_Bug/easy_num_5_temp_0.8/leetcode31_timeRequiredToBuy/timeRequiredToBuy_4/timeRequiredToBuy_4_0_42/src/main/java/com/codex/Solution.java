package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> queue = new LinkedList<Integer>();
        int seconds = 0;
        for(int i = 0; i < tickets.length; i++){
            queue.add(tickets[i]);
            seconds += tickets[i];
            
        } 
        while(k > 0){
            int person = queue.remove();
            if(person == 0) continue;
            if(k == 0) {
                seconds += person;
                queue.add(person);
                k = queue.size() - 1;
            }
            else{
                queue.add(person - 1);
                seconds++;
                k--;
            }
        }
        return seconds;
    }

    
}