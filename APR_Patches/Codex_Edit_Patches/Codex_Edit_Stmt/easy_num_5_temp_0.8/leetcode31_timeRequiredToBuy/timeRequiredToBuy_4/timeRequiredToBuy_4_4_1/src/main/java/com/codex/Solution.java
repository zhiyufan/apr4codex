package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> queue = new LinkedList<Integer>();
        //add all people in the queue
        for(int i = 0; i < tickets.length; i++){
            queue.add(tickets[i]);
        }
        int seconds = 0;
        while(!queue.isEmpty()){
            int person = queue.remove();
            if(person == 0) continue;
            if(k == 0) {
                //as it is the last person to be served
                //he has to wait untill everyone else is served
                //then he gets served
                seconds += person;
                queue.add(person - 1);
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