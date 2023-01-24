package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {

        //insert the elements in the queue
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i = 0; i < tickets.length; i++){
            queue.add(tickets[i]);
        }

        //initialize seconds
        int seconds = 0;

        //loop until the queue is empty
        while(!queue.isEmpty()){
            int person = queue.remove();

            //if the person has no tickets, skip the person
            if(person == 0) continue;

            //if the tickets are sold out, go to the next person
            if(k == 0) {
                seconds += person;
                queue.add(person);
                k = queue.size() - 1;
            }

            //if the tickets are still in stock, sell one ticket
            else{
                queue.add(person - 1);
                seconds++;
                k--;
            }
        }
        return seconds;
    }

    
}