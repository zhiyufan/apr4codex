package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> queue = new LinkedList<Integer>();
        int seconds = 0;
        for(int i = 0; i < tickets.length; i++){
            if(tickets[i] != 0){
                queue.add(tickets[i]);
            }
            else{
                seconds++;
            }
        }
        while(!queue.isEmpty()){
            int person = queue.remove();
            int ticket = person - 1;
            if(ticket == 0) {
                seconds += person + k;
            }
            else if(k == 0) {
                seconds += person * person;
                queue.add(person);
            }
            else{
                queue.add(ticket);
                seconds++;
            }
            if(k > 0) {
                k--;
            }
        }
        return seconds;
    }

    
}