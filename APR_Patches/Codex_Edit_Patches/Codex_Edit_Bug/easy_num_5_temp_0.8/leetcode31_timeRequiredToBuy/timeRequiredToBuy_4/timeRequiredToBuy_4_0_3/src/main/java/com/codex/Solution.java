package com.codex;

import java.util.*;

public class Solution {
package dynamic;

import java.util.LinkedList;
import java.util.Queue;

public class TimeRequiredToBuyTicket {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> ticketLine = new LinkedList<>();
        for (int person : tickets) {
            ticketLine.add(person);
        }
        int turn = 0;
        while (!ticketLine.isEmpty()) {
            // get the first person in the queue
            int person = ticketLine.remove();
            // if he already has the ticket
            if (person == 0) {
                continue;
            }
            // if the turn has not reached him and
            // if the turn is the last one
            if (k == 0 || k == ticketLine.size()) {
                // increment by 1
                turn += person;
                // add him again to the queue
                ticketLine.add(person);
                // reset the turn to the end of the queue
                k = ticketLine.size() - 1;
            }
            // otherwise
            else {
                // add it back to the queue
                ticketLine.add(person - 1);
                // decrement turn
                k--;
                // increment turn
                turn++;
            }
        }
        return turn;
    }

    public static void main(String[] args) {
        int tickets[] = { 2, 6, 3, 4, 5 };
        int k = 3;
        System.out.println(timeRequiredToBuy(tickets, k));

        
    }
}
}