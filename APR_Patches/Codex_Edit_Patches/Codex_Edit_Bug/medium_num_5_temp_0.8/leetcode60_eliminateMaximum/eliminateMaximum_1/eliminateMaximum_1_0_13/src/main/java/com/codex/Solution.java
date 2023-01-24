package com.codex;

import java.util.*;

public class Solution {
/**
* @author: Miguel Paz - Miguel.Paz@jpmorgan.com
*/

    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        int[] time = new int[dist.length]; // Create array of the same size as original
        for(int i = 0; i < time.length; i++) { // Loop to fill the array with the time taken by each car
            time[i] = dist[i] * speed[i]; // Time = distance * speed
        }
        Arrays.sort(time); // Sort the array by the time taken by the car.
        int maxIndex = 0; // Index to hold the index of the car that takes the most time.
        for(int i = 0; i < time.length; i++) { // Loop to find the greatest time
            if(time[i] > time[maxIndex]) { // If the time of the current car is greater than the time of the one in the stored index, then store the current index.
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    
}