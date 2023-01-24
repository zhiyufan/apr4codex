package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < tickets.length; i++){
            queue.add(tickets[i]);
        }
        int seconds = 0;
        while(!queue.isEmpty()){
            int person = queue.remove();
            if(person == 0) continue;
            if(k == 0) {
                seconds += person;
                k = queue.size() - 1;
            }
            else{
                queue.add(person - 1);
                seconds++;
                k--;
            }
            queue.add(person);
        }
        return seconds;
    }

    
}