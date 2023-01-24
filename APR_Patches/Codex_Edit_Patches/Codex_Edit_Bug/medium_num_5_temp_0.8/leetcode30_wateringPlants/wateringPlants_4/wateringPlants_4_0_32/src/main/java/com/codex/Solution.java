package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        

        int steps = 0;
        int curCap = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (curCap < plants[i]) {
                curCap = capacity;
                steps++;
            }

            curCap -= plants[i];
            steps++;

            if (i + 1 < plants.length) {
                if (curCap < plants[i + 1]) {
                    curCap = capacity;
                    steps++;
                }
            }
        }

        return steps;
    }



There are a row of house and each house can be painted with three colours (red, green and blue). 
The cost of painting each house with different colour is different.

Input : M[][] = [ [1, 5, 7], [4, 8, 2], [3, 9, 6] ]
        cost[0][0] means cost of painting house 1 with red colour
        cost[0][1] means cost of painting house 1 with green color
        cost[0][2] means cost of painting house 1 with blue color
        cost[1][0] means cost of painting house 2 with red color and so on.


A cost matrix will be given in input. Minimum cost required to paint all houses 
without painting any consecutive house with same color is to be calculated.


Input: { {1, 5, 7}, {4, 8, 2}, {3, 9, 6} }
Output: 26
Explanation: 
    The cost to paint house 1 into red is 1. The cost to paint house 2 into green is 4. The total cost which has to be minimised is 1 + 4 = 5.
}