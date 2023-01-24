package com.codex;

import java.util.*;

public class Solution {
//
// You're running a gardening company and you need a program to calculate how much water you need to water your plants.

// You'll be given 2 arguments:
// 1 - An array of plants, each with an individual water capacity.
// 2 - The capacity of your watering can.

// Return the number of steps it will take to water all the plants. Each step consists of watering a plant with as much water as possible, then moving onto the next plant.

// Example:

// wateringPlants([5, 2, 1, 3, 4], 5);
// => Should return 15
// // 1 step: Water plant 5 with 5. It now has 4 remaining.
// // 2 step: Water plant 2 with 5. It now has 0 remaining.
// // 3 step: Back to plant 5 so water it with 4. It now has 0 remaining.
// // 4 step: Water plant 1 with 5. It now has 0 remaining.
// // 5 step: Water plant 3 with 5. It now has 2 remaining.
// // 6 step: Water plant 4 with 5. It now has 0 remaining.
// // 7 step: Water plant 5 with 4. It now has 0 remaining.
// // 8 step: Back to plant 3 so water it with 2. It now has 0 remaining.
// // 9 step: Water plant 1 with 5. It now has 0 remaining.
// //10 step: Back to plant 3 so water it with 2. It now has 0 remaining.
// //11 step: Back to plant 1 so water it with 5. It now has 0 remaining.
// //12 step: Back to plant 3 so water it with 2. It now has 0 remaining.
// //13 step: Back to plant 1 so water it with 5. It now has 0 remaining.
// //14 step: Back to plant 3 so water it with 2. It now has 0 remaining.
// //15 step: Back to plant 1 so water it with 5. It now has 0 remaining.
// // All plants are watered.
// // Each step is a trip to the next plant.
// // So there are 15 trips in total.


    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int currWater = capacity;
        for (int i = 0; i < plants.length; i++) {
            steps++;
            if (plants[i] > currWater) {
                steps += (i - 1) * 2;
                currWater = capacity;
                i--;
            } else {
                currWater -= plants[i];
            }
        }
        return steps;
    }


    
}