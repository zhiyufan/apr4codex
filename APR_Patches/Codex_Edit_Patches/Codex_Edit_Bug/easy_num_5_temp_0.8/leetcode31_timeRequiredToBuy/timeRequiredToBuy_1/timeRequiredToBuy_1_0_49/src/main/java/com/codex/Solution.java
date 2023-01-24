package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Solution {

    public static int timeRequiredToBuy(int[] tickets, int k,int people) {
        
        int[] counter = new int[people];
        for (int i = 0; i < people; i++) {
            counter[i] = tickets[i];}
        int time = 0;
        int maximum = 0;
        for(int i = 0; i < people; i++) {
            if (tickets[i] > maximum) {
                maximum = tickets[i];
            }
        }
        while (maximum > 0) {
            maximum--;
            time++;
        
        while (counter[k] > 0) {
            time++;
            for (int i = 0; i < counter.length; i++) {
                if (counter[i] > 0) {
                    counter[i]--;
                }
            }
        }}
        return time;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int people = in.nextInt();
        int k = in.nextInt();
        int[] tickets = new int[people];
        for(int i = 0; i < people; i++) {
            tickets[i] = in.nextInt();
        }
        System.out.println(timeRequiredToBuy(tickets, k,people));
        in.close();
    }
}
}