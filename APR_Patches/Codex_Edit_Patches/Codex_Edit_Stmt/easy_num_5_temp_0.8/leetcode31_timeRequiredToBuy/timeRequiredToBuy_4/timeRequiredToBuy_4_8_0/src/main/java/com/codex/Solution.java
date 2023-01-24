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
            int ticket = queue.remove();
            if(ticket == 0) continue;
            if(k == 0 || ticket > k){
                seconds += ticket;
                queue.add(ticket);
                k = queue.size() - 1;
            }
            else{
                queue.add(ticket - 1);
                seconds++;
                k--;
            }
        }
        return seconds;
    }

    
}