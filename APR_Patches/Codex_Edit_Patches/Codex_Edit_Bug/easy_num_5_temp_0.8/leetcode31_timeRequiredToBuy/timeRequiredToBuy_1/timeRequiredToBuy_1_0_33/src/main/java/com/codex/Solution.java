package com.codex;

import java.util.*;

public class Solution {
public static int timeRequiredToBuy(int[] tickets, int k) {

    int[] counter = new int[tickets.length];
    for (int i = 0; i < tickets.length; i++) {
        counter[i] = tickets[i];
    }
    int time = 0;
    int firstExam = 0;
    int kIndex = 0;
    while (counter[k] > 0) {
        time++;
        if (counter[firstExam] <= 0) {
            firstExam++;
        }
        for (int i = firstExam; i < counter.length; i++) {
            counter[i]--;
        }
   }
   return time;
}
}