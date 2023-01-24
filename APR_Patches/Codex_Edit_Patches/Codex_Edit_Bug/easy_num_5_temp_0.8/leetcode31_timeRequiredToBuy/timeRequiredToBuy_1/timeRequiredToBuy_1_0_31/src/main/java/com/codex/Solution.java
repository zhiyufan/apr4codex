package com.codex;

import java.util.*;

public class Solution {
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment2q2;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int[] counter = new int[tickets.length];
        for (int i = 0; i < tickets.length; i++) {
            counter[i] = tickets[i];
        }
        int time = 0;
        int x = counter[k];
        while (x > 0) {
            time++;
            for (int i = 0; i < counter.length; i++) {
                if (counter[i] > 0) {
                    counter[i]--;
                }
            }
            x = counter[k];
        }
        return time;
    }

    public static void main(String[] args) {
        int[] tickets = {2, 6, 3, 4, 5};
        int k = 2;
        int time = timeRequiredToBuy(tickets, k);
        System.out.println("Time is: " + time);
    }

}
}