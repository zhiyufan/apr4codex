package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 4, 5, 1};
        System.out.println(timeRequiredToBuy(arr, 2));
    }
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < tickets.length; i++){
            queue.add(tickets[i]);
        }
        int seconds = 0;
        while (queue.size() > 0) {
            int person = queue.remove();
            System.out.println(queue.size() + " " + k);
            if (person == 1) {
                seconds++;
                k--;
            }
            else if (k == 0) {
                queue.add(person - 1);
                seconds += person;
                k = queue.size() - 1;
            } else {
                seconds++;
                queue.add(person - 1);
                seconds++;
                k--;
            }
        }
        return seconds;
    }

    
}