package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {        
        // Arrays.sort(cost);
        // int sum = 0;
        // for (int i = 0; i < cost.length; i++) {
        //     if (i % 3 == 2) {
        //         continue;
        //     }
        //     sum += cost[i];
        // }
        // return sum;

        // Another approach
        Arrays.sort(cost); // Sort the array 
        int sum = 0; // Variable to store the sum
        for (int i = cost.length - 1; i >= 0; i -= 3) { // Using for loop
          sum += cost[i]; // Add the element and subtract by 3
          if (i - 1 >= 0) { // Checking if i - 1 is greater than zero
            sum += cost[i-1]; // If yes then add the element
          }
        }

       return sum; // Return the sum
    }
}