package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> queue = new LinkedList<Integer>();
        if(tickets.length == 0) return 0;
        for(int i = 0; i < tickets.length; i++){
            queue.add(tickets[i]);
        }
        int count = 0;
        for(int n : tickets){
            count += n;
        }
        int seconds = 0;
        while(count > 0){
            int person = queue.remove();
            count--;
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