package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

        int minTime = 0;
        HashMap<Character, Integer> letterPosition = new HashMap<>();
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for(int i = 0; i < letters.length; i++) {
            letterPosition.put(letters[i], i);
        }

        for(int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            char next = word.charAt(i+1);
            int currentPosition = letterPosition.get(current);
            int nextPosition = letterPosition.get(next);
            minTime += Math.min(Math.abs(nextPosition - currentPosition), 26 - Math.abs(nextPosition - currentPosition));
        }

        return minTime;
    }













// https://leetcode.com/problems/minimum-time-visiting-all-points/

        public int minTimeToVisitAllPoints(int[][] points) {
        
        int minTime = 0;
        
        for(int i = 0; i < points.length-1; i++) {
            int currentX = points[i][0];
            int currentY = points[i][1];
            
            int nextX = points[i+1][0];
            int nextY = points[i+1][1];
             
            minTime += Math.max(Math.abs(currentX-nextX), Math.abs(currentY-nextY));
        }
        return minTime;
    }
    
}