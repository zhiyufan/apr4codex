package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < tickets.length; i++){
            if(tickets[i] < 0) {
                return -1;
            }
            queue.add(tickets[i]);
        }
        int seconds = 0;
        while(!queue.isEmpty()){
            int person = queue.remove();
            if(person == 0) continue;
            if(k == 0) {
                seconds += person;
                queue.add(person);
                k = queue.size() - 1;
            }
            else{
                if(person == 1){
                    k--;
                    seconds++;
                    continue;
                }
                queue.add(person - 1);
                seconds++;
                k--;
            }
        }
        return seconds;
    }

    
}