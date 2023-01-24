package com.codex;

import java.util.*;

public class Solution {
    /*
    Problem:
        Your friend is throwing a party and has invited N guests. To avoid awkwardness, he wants to sit everyone in a single row such that the following conditions are satisfied:
            There are no empty seats.
            There are no adjacent women sitting together.
        
        Write a function that returns the smallest possible number of chairs that can be used, given a list of when each guest arrives and leaves.

        Signature
        int numberOfChairs(int[][] times)
        Input
        times is a list of arrays. Each item in times represents a guest with two elements: an arrival time and a departure time.
        1 ≤ times[i][0] < times[i][1] ≤ 1000
        Output
        Return the smallest number of chairs necessary, or 0 if it's impossible.
        Example
        times = [[30, 75], [0, 50], [60, 150]]
        output = 2
    */

    public static int smallestChair(int[][] times, int targetFriend) {

        // if there are any gaps between two people, return -1
        for(int i = 0; i < times.length - 1; i++){
            if(times[i][1] > times[i+1][0] || times[i][1] == times[i+1][0]) return -1;
        }
        
        // go through all the possible chairs, and at each chair, check if all the seats are occupied
        // if they are, add that chair to the possible chair list
        ArrayList<Integer> possibleChairs = new ArrayList<>();

        int endIndex = times.length - 1;
        boolean isFirstIndex = true;
        for(int i = 0; i < times.length; i++) {
            int chairIndex = 0;
            if(times[targetFriend][0] >= times[i][0]) chairIndex++;
            if(times[targetFriend][1] <= times[i][1]) chairIndex++;
            if(chairIndex == 0) {
                possibleChairs.add(i);
                if(isFirstIndex) endIndex = i;
                isFirstIndex = false;
            }
        }
        return -1;
    }

    
}