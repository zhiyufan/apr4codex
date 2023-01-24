package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    int rowCosts[] = new int[26];
    int colCosts[] = new int[26];

    public int minTimeToVisitAllPoints(int[][] points) {
        

        int totalCost = 0;

        for(int i = 0; i < 26; i++) {
            rowCosts[i] = 0;
            colCosts[i] = 0;
        }

        for(int i = 0; i < word.length()-1; i++) {
            char current = word.charAt(i);
            char next = word.charAt(i+1);
            int currentPosition = letterPosition.get(current);
            int nextPosition = letterPosition.get(next);
            minTime += Math.min(Math.abs(nextPosition - currentPosition), 26 - Math.abs(nextPosition - currentPosition));
        }

        return minTime;
    }

    
}