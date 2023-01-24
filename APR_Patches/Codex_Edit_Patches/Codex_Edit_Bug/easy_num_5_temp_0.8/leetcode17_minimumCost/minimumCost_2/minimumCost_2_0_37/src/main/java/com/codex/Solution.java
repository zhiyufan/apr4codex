package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        Arrays.sort(cost); //sort in ascending order
        int sum = 0; //initialise sum
        for (int i = 0; i < cost.length; i++) { //loop till the length of the array is reached
            if (i % 3 == 2) { //check if the reminder is equal to 2 
                continue; //continue the loop
            }
            sum += cost[i];
        }
        return sum;
    }

    
}