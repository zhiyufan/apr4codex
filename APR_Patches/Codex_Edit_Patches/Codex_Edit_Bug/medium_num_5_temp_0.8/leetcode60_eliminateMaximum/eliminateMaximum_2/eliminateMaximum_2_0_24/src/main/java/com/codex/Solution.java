package com.codex;

import java.util.*;

public class Solution {
    private void swap(int[] prices, int i, int j) {
        int temp = prices[i];
        prices[i] = prices[j];
        prices[j] = temp;
    }
    int findIndexOfMinimum(int[] prices, int start) {
        int minIndex = -1;
        int min = Integer.MAX_VALUE;
        for (int i = start; i < prices.length; i++) {
            if (prices[i] < min) {
                minIndex = i;
                min = prices[i];
            }
        }
        return minIndex;
    }
    private int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        for (int i = 0; i < keyboards.length; i++) {
            int minIndex = findIndexOfMinimum(keyboards, i);
            swap(keyboards, i, minIndex);
        }
        return count;
    }

    
}