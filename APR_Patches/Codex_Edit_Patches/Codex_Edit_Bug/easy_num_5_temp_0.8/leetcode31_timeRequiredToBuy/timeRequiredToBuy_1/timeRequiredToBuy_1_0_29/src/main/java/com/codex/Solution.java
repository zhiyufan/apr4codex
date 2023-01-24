package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int [] array = new int[tickets.length];
        for (int i = 0; i< tickets.length; i++) {
            array[i] = tickets[i];
        }
        int index = k;
        int totalTime = 0;
        while (array[index] > 0) {
            totalTime++;
            for (int i = 0; i< array.length; i++) {
                if (array[i] > 0) {
                    array[i]--;
                }
            }
        }
        return totalTime;
    }

}
}